/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.controller;

import br.com.socin.apigithub.model.User;
import br.com.socin.apigithub.service.UserServiceIF;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/api")
public class SessionController {

    @Autowired
    private UserServiceIF userService;

    @ApiOperation(value = "Método de autenticação: login")
    @PostMapping("/user/authenticate")
    public ResponseEntity<Object> authenticate(@RequestBody User user) {
        Long id = this.userService.login(user.getEmail(), user.getPassword());
        if (id > 0L) {
            return ResponseEntity.status(HttpStatus.OK).body(id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

    }

}
