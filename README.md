
<h3 align="center">
  Dev Top
</h3>

<p align="center">Nessa api fazemos encontrar os melhores programadores do
mercado. O Usuário avaliar os desenvolvedores de código aberto do github,
as métricas de avaliação são linguagem e data do utimo commit.</p>
 [va para o site]( https://topdevs.herokuapp.com/)


## 👨🏼‍💻 Responsavel

- [José Ferreira](https://github.com/joseferreira01/)

## 🚀 Tecnologias

- ⚡ Spring(boot, JPA, REST)

## ✋🏻 Pré-requisitos

- [java ](https://www.java.com/pt-BR/) `Vesão 8 ou superior`
- [mavem](https://maven.apache.org/) `Vesão 3.8 ou superior`
- [posgreSQL](https://www.postgresql.org/) `Vesão 10 ou superior`

## 🔥 Instalação e execução no localhost

1. Faça um clone desse repositório;
2. Entre na pasta `cd devtop`;
3. Configure a conexao com o banco `apigithub/src/main/resources/application.properties`
4. Altere `URL, username e password .
5.Configure variáveis ambiente:
- APP_CLAENT_SECRETS
- APP_CLAENT_ID.
<p>
Essas variáveis são necessárias para utilização da API do github https://docs.github.com/pt/enterprise-server@3.0/developers/apps/building-github-apps/creating-a-github-app
</p>

5. Rode `mvn clean packag` para instalar as dependências e criar o executavel (api.jar);
6. Rode `java -jar target/api.jar` para iniciar o servidor.
7. Acesse  [use a api no localhost](http://localhost:8080/api/user)
8. Documentação [docs](http://localhost:8080/v2/api-docs)



## ⚡️ Como contribuir

- Faça um fork desse repositório;
- Cria uma branch com a sua feature: `git checkout -b minha-feature`;
- Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`;
- Faça push para a sua branch: `git push origin minha-feature`.

Depois que o merge da sua pull request for feito, você pode deletar a sua branch.

##  Código do front and 
- [Aqui ](https://github.com/joseferreira01/devtop-front)

---

Feito com 💖 by José Ferreira 👋 [Entre na nossa comunidade!](https://github.com/joseferreira01/)
