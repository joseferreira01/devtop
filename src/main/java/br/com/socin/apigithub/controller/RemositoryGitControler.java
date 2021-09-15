/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.controller;

import br.com.socin.apigithub.model.Metricas;
import br.com.socin.apigithub.model.RemositoryGit;
import br.com.socin.apigithub.service.ApiGithubService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/api")
public class RemositoryGitControler {

    @Autowired
    ApiGithubService service;

    @ApiOperation(value = "Retorna uma lista de usuários")
    @GetMapping("/repos")
    public RemositoryGit index(
            @RequestParam(name = "language") String language,
            @RequestParam(name = "page") int page) {
        Metricas metricas = new Metricas(language, page);

        return this.service.find(metricas);
    }

}
