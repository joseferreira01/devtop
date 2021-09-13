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

/**
 *
 * @author jose
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceIF userService;

    @GetMapping("/user")
    public List<User> index() {
        return this.userService.index();
    }

    @GetMapping("/user{id}")
    public User findOn(@PathVariable(value = "id") long id) {
        return this.userService.find(id);
    }

    @PostMapping("/user")
    public User store(@RequestBody User user) {
        return this.userService.store(user);

    }

    @PutMapping("/user")
    public User up(@RequestBody User user) {
        return this.userService.store(user);

    }
    @DeleteMapping("/user")
    public void delete(@RequestBody User user) {
        this.userService.delete(user);

    }
}
