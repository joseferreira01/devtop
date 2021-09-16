/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TesteControler {

    @ApiOperation(value = "Teste de funcionamento")
    @GetMapping()
    public String test() {
        return "API dev top no ar";
    }
}
