package com.oas.imobiliaria.controller;

import com.oas.imobiliaria.model.dto.PropriedadeDTO;
import com.oas.imobiliaria.service.PropriedadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/propriedade")
public class PropriedadeController {

    @Autowired
    private PropriedadeService service;

    @GetMapping("/buscarTodas.do")
    public List<PropriedadeDTO> buscarTodas(){
        return service.buscarTodasPropriedades();
    }
}
