/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.controller;

import br.com.socin.apigithub.model.User;
import br.com.socin.apigithub.service.UserServiceIF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author jose
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@Api(value = "API REST Dev top")
public class UserController {

    @Autowired
    private UserServiceIF userService;

    @ApiOperation(value = "Retorna uma lista de usuários")
    @GetMapping("/user")
    public List<User> index() {
        return this.userService.index();
    }

    @ApiOperation(value = "Retorna um Usuário unico")
    @GetMapping("/user/{id}")
    public User findOn(@PathVariable Long id) {
        return this.userService.find(id);
    }

    @ApiOperation(value = "Criar um usuario")
    @PostMapping("/user")
    public User store(@RequestBody User user) {
        return this.userService.store(user);

    }

    @ApiOperation(value = "Atualizar dodos do usuário")
    @PutMapping("/user")
    public User up(@RequestBody User user) {
        return this.userService.store(user);

    }

    @ApiOperation(value = "Apaga um Usuario Header:Authorization <Long>.")
    
    @DeleteMapping("/user")
    public void delete(@RequestHeader("Authorization") Long authorization,@RequestBody User user) {
        System.err.println("deletando user "+authorization);
        this.userService.delete(authorization);

    }
}
