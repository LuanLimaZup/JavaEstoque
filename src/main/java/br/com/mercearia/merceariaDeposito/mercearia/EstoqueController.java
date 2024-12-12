package br.com.mercearia.merceariaDeposito.mercearia;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private final EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @PostMapping
    public void cadastrar(@RequestBody @Valid EstoqueDTO dto) {
        estoqueService.criarEstoque(dto);
    }

    @GetMapping
    public List<EstoqueDTO> buscarTodos() {
        return estoqueService.buscarEstoque();
    }

    @GetMapping("{id}")
    public EstoqueDTO getById(@PathVariable Long id) {
        return estoqueService.buscarPorId(id);
    }

    @PutMapping("{id}")
    public EstoqueDTO atualizar(@PathVariable @NotNull Long id, @RequestBody @Valid EstoqueDTO dto) {
        EstoqueDTO estoqueAtualizado = estoqueService.atualizarEstoque(id, dto);
        return estoqueAtualizado;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable @NotNull Long id) {
        estoqueService.deletar(id);

    }
}
