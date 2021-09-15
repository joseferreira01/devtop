/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.socin.apigithub.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author jose
 */
public class RemositoryGit {
    private String total_count;
    private Items items[];
   
    public String getTotal_count() {
        return total_count;
    }


    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "RemositoryGit{" + "total_count=" + total_count + ", items=" + items + '}';
    }

   
}
