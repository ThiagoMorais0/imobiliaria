package com.oas.imobiliaria.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.oas.imobiliaria.model.Propriedade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropriedadeDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private String tipoPropriedade;
    private BigDecimal preco;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private BigDecimal areaTotal;
    private Integer quartos;
    private Integer banheiros;
    private Integer vagasGaragem;
    @JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "UTC")
    private Date dataCriacao;

    public PropriedadeDTO toDTO(Propriedade entity) {
        PropriedadeDTO dto = new PropriedadeDTO();
        dto.setId(entity.getId());
        dto.setTitulo(entity.getTitulo());
        dto.setDescricao(entity.getDescricao());
        dto.setTipoPropriedade(entity.getTipoPropriedade());
        dto.setPreco(entity.getPreco());
        dto.setEndereco(entity.getEndereco());
        dto.setCidade(entity.getCidade());
        dto.setEstado(entity.getEstado());
        dto.setCep(entity.getCep());
        dto.setAreaTotal(entity.getAreaTotal());
        dto.setQuartos(entity.getQuartos());
        dto.setBanheiros(entity.getBanheiros());
        dto.setVagasGaragem(entity.getVagasGaragem());
        dto.setDataCriacao(entity.getDataCriacao());
        return dto;
    }
}
