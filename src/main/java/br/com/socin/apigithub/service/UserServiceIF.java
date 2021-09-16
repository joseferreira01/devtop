/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.service;

import br.com.socin.apigithub.model.User;
import java.util.List;

/**
 *
 * @author jose
 */
public interface UserServiceIF {

    User store(User user);

    List<User> index();

    User find(Long id);

    void delete(Long id);

    Long login(String email, String password);
}
