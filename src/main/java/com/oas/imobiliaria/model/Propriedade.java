package com.oas.imobiliaria.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "propriedade")
@Getter
@Setter
public class Propriedade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tipo_propriedade")
    private String tipoPropriedade;
    @Column(name = "preco")
    private BigDecimal preco;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cep")
    private String cep;
    @Column(name = "area_total")
    private BigDecimal areaTotal;
    @Column(name = "quartos")
    private Integer quartos;
    @Column(name = "banheiros")
    private Integer banheiros;
    @Column(name = "vagas_garagem")
    private Integer vagasGaragem;
    @Column(name = "data_criacao")
    private Date dataCriacao;

}
