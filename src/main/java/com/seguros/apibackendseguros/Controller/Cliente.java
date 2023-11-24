package com.seguros.apibackendseguros.Controller;

import com.seguros.apibackendseguros.models.ClienteModels;
import com.seguros.apibackendseguros.service.CienteServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class Cliente {
    @Autowired
    private CienteServise cienteServise;
    @GetMapping

    public ArrayList<ClienteModels> obtenerClientes(){
        return this.cienteServise.obtenerClientes();
    }

}
