/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.model;

import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class RemositoryGit {
    private String name;
    private String html_url;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RemositoryGit{" + "name=" + name + ", html_url=" + html_url + '}';
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
    
    
    
}
