package br.com.socin.apigithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication

public class ApigithubApplication {
    @Bean
    public WebClient webClient(WebClient.Builder buildr){
      return buildr.baseUrl("https://api.github.com")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

	public static void main(String[] args) {
		SpringApplication.run(ApigithubApplication.class, args);
	}

}
