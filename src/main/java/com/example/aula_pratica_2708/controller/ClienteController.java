package com.example.aula_pratica_2708.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public String getClientes(){
        return "Algum dia vai retornar todos os clientes do BD!";
    }

    @GetMapping("/cliente/{codigo}")
    public String getClientes1(@PathVariable int codigo){
        if(codigo > 0)
        return "Algum dia vai retornar o clientes do ID desejado do BD! - " + codigo;
        else
        return "Erro, codigo invalido " + codigo;

    }



}