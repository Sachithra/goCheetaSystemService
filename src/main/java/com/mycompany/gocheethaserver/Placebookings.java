/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

/**
 *
 * @author User
 */
public class Placebookings {
    private int id;
    private String pick;
    private String drop;

    public Placebookings() {
    }

    public Placebookings(int id, String pick, String drop) {
        this.id = id;
        this.pick = pick;
        this.drop = drop;
    }

   

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
