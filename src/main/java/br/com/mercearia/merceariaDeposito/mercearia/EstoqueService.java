package br.com.mercearia.merceariaDeposito.mercearia;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
}
