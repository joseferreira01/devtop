/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.service;

import br.com.socin.apigithub.model.Metricas;
import br.com.socin.apigithub.model.RemositoryGit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 *
 * @author jose
 */
@Service
public class ApiGithubService {
    @Autowired
    WebClient WebClient;
    public RemositoryGit find(Metricas metricas){
        Mono<RemositoryGit> monoRemositoryGit = this.WebClient
                .method(HttpMethod.GET).uri("/users/joseferreira01")
                .retrieve()
                .bodyToMono(RemositoryGit.class);
        monoRemositoryGit.subscribe(r ->{
            System.out.println("retono da api git "+r.toString());
        });
        
        return monoRemositoryGit.block();
    }
        
    }