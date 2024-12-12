package br.com.mercearia.merceariaDeposito.mercearia;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estoque")
public class PizzaController {

    private final EstoqueService estoqueService;

    public PizzaController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @PostMapping
    public void cadastrar(@RequestBody EstoqueDTO dto) {
        estoqueService.criarEstoque(dto);
    }

}
