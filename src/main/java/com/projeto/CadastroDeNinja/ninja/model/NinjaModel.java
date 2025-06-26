package com.projeto.CadastroDeNinja.ninja.model;

import com.projeto.CadastroDeNinja.missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") //chave estrangeira
    private MissoesModel missoes;

}
