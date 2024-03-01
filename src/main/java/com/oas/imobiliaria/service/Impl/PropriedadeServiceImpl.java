package com.oas.imobiliaria.service.Impl;

import com.oas.imobiliaria.dao.PropriedadeDao;
import com.oas.imobiliaria.model.Propriedade;
import com.oas.imobiliaria.model.dto.PropriedadeDTO;
import com.oas.imobiliaria.service.PropriedadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropriedadeServiceImpl implements PropriedadeService {

    @Autowired
    PropriedadeDao propriedadeDao;

    @Override
    public List<PropriedadeDTO> buscarTodasPropriedades() {
        return propriedadeDao.buscarTodas().stream().map(new PropriedadeDTO()::toDTO).collect(Collectors.toList());
    }
}
