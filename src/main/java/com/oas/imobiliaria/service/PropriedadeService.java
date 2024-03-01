package com.oas.imobiliaria.service;

import com.oas.imobiliaria.model.Propriedade;
import com.oas.imobiliaria.model.dto.PropriedadeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropriedadeService {
    List<PropriedadeDTO> buscarTodasPropriedades();

}
