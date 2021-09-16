/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.model;

/**
 *
 * @author jose
 */
public class Items {
    private String id;
    private String name;
    private String html_url;
    private String description;
    private Owner owner;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Items{" +"id=" + id +"name=" + name + ", html_url=" + html_url + ", description=" + description + ", owner=" + owner + '}';
    }

}
