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
import io.swagger.annotations.ApiParam;
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

    @ApiParam(required = true,
            example
            = "language=java o segundo parametro é page (http(s):// hostname/api/repos?language=java&page=1)")
    @ApiOperation(value = "Retorna uma lista de repositóris do github que tem códigos escritos em liguagem especifica.")
    @GetMapping("/repos")
    public RemositoryGit index(
            @RequestParam(name = "language") String language,
            @RequestParam(name = "page",required = false) int page) {
        Metricas metricas = new Metricas(language, page);

        return this.service.find(metricas);
    }

}
