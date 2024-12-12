package br.com.mercearia.merceariaDeposito.mercearia;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository estoqueRepository;
    private final ModelMapper modelMapper;

    public EstoqueDTO criarEstoque(EstoqueDTO dto) {
        Estoque estoque = modelMapper.map(dto, Estoque.class);
        estoqueRepository.save(estoque);
        return modelMapper.map(estoque, EstoqueDTO.class);

    }

    public List<EstoqueDTO> buscarEstoque() {
        return estoqueRepository.findAll().stream().map(p -> modelMapper.map(p, EstoqueDTO.class))
                .collect(Collectors.toList());

    }

    public EstoqueDTO buscarPorId(Long id) {

        Estoque estoque = estoqueRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return modelMapper.map(estoque, EstoqueDTO.class);
    }


    public EstoqueDTO atualizarEstoque(Long id, EstoqueDTO dto) {
        Estoque estoqueExistente = modelMapper.map(dto, Estoque.class);
        estoqueExistente.setId(id);
        estoqueExistente = estoqueRepository.save(estoqueExistente);
        return modelMapper.map(estoqueExistente, EstoqueDTO.class);
    }

    public void deletar(Long id) {
    estoqueRepository.deleteById(id);

    }
}
