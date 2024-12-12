package br.com.mercearia.merceariaDeposito.mercearia;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EstoqueDTO {

    private Long id;

    @NotBlank(message = "O nome não pode estar vazio.")
    private String nome;

    @NotBlank(message = "O código não pode estar vazio.")
    private String codigo;

    @Future(message = "A validade deve ser uma data futura.")
    private LocalDate validade;

    @Min(value = 1, message = "A quantidade deve ser no mínimo 1.")
    private int quantidade;

    @DecimalMin(value = "0.01", message = "O custo deve ser maior que zero.")
    private double custo;

    @DecimalMin(value = "0.01", message = "O valor de venda deve ser maior que zero.")
    private double valorVenda;

    private Categoria categoria;
}
