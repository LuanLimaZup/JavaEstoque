package br.com.mercearia.merceariaDeposito.mercearia;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EstoqueDTO {

    private String nome;
    private String codigoBarras;
    private LocalDate validade;
    private int quantidade;
    private double custo;
    private double valorVenda;
}
