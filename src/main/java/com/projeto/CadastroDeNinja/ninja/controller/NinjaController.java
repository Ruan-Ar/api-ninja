package com.projeto.CadastroDeNinja.ninja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/consulta")
    public String boasVindas(){
        return "Bem vindo";
    }





}
