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
public class Metricas {

    private String language;
    private int page;

    public Metricas(String language, int page) {
        this.language = language;
        this.page = page;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Metricas{" + "language=" + language + ", page=" + page + '}';
    }

}
