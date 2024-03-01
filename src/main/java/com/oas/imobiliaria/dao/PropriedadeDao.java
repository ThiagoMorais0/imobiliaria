package com.oas.imobiliaria.dao;

import com.oas.imobiliaria.model.Propriedade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropriedadeDao extends JpaRepository<Propriedade, Long> {

    @Query(value = "SELECT * FROM propriedade",nativeQuery = true)
    List<Propriedade> buscarTodas();
}
