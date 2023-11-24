package com.seguros.apibackendseguros.Controller;

import com.seguros.apibackendseguros.models.PolizaModels;
import com.seguros.apibackendseguros.service.PolizaServise;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
@RequestMapping("/poliza")
public class Cliente {

    @Autowired
    private PolizaServise polizaServise;
    @PersistenceContext
    private EntityManager em ;
    @GetMapping
    public ArrayList<PolizaModels> obtenerClientes(@RequestParam String num_poliza){

       return (ArrayList<PolizaModels>) this.polizaServise.getPolizas(num_poliza);
    }

}
