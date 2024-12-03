package br.com.mercearia.merceariaDeposito.mercearia;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Estoque")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Estoque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String codigoBarras;
    private LocalDate validade;
    private int quantidade;
    private double custo;
    private double valorVenda;


}
