/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

/**
 *
 * @author User
 */
public class SalesDetails {
    private String pick;
    private String branch;

    public SalesDetails() {
    }

    
    
    public SalesDetails(String pick, String branch) {
        this.pick = pick;
        this.branch = branch;
    }

    
    
    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
}
