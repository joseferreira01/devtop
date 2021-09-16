/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.service;

import br.com.socin.apigithub.model.Metricas;
import br.com.socin.apigithub.model.RemositoryGit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${CLAENT_SECRETS}")
    private String client_secrets;
    @Value("${CLAENT_ID}")
    private String client_id;

    @Autowired
    WebClient WebClient;

    public RemositoryGit find(Metricas metricas) {
        System.err.println("id= "+client_id+ ",  chave= "+client_secrets);
        
         //search/repositories?q=language:TypeScript&sort=stars&page=1
        StringBuffer uri = new StringBuffer();
        uri.append("/search/repositories?q=language:");
        uri.append(metricas.getLanguage());
        uri.append("&sort=stars&page=");
        uri.append(metricas.getPage());
        uri.append("&client_id=");
        uri.append(client_id);
        uri.append("&Client_secrets=");
        uri.append(client_secrets);
        System.err.println("uri: search/repositories?q=language:TypeScript&sort=stars&page=1");
        System.err.println("uri sai " + uri.toString());
        
        Mono<RemositoryGit> monoRemositoryGit = this.WebClient
                //.method(HttpMethod.GET).uri("/users/joseferreira01")
                .method(HttpMethod.GET).uri(uri.toString())
                .retrieve()
                .bodyToMono(RemositoryGit.class);
        monoRemositoryGit.subscribe(r -> {
            System.out.println("retono da api git " + r.toString());
        });

        return monoRemositoryGit.block();
    }

}
