/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.repository;

import br.com.socin.apigithub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jose
 */
public interface UserRepositoey extends JpaRepository<User, Long>{
    User findByEmail(String email);
    
}
