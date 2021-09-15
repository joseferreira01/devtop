/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.service;

import br.com.socin.apigithub.model.User;
import br.com.socin.apigithub.repository.UserRepositoey;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class UserService implements UserServiceIF {
    
    @Autowired
    private UserRepositoey repository;
    
    @Override
    public User store(User user) {
        user.setPassword(Criptografar.hashPassword(user.getPassword()));
        User u = this.repository.save(user);
        u.setPassword("");
        return u;
        
    }
    
    @Override
    public List<User> index() {
        System.out.println("env "+getProp().getProperty("urluser"));
        return this.repository.findAll();
    }
    
    @Override
    public User find(Long id) {
        return this.repository.getById(id);
    }
    
    @Override
    public void delete(User user) {
        repository.delete(user);
    }
    
    @Override
    public Long login(String email, String password) {
        User user = this.repository.findByEmail(email);
        if (user != null && user.getPassword().equals( Criptografar.hashPassword(password))) {
            return user.getId();
        } else {
            return -1L;
        }
    }
    

public static Properties getProp() {
        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream(
                    "./servidor.properties");
            props.load(file);
            return props;
        } catch (IOException e) {
        }
        return props;
    }
}