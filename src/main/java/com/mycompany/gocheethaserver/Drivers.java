/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheethaserver;

/**
 *
 * @author User
 */
public class Drivers {
    private int id;
    private String name;
    private String age;
    private String branch;
    private String phone;
    private String feedbacks;
    private boolean isValidate;

    public Drivers() {
    }

    public Drivers(int id, String name, String age, String branch, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.phone = phone;
    }

    public Drivers(int id, String name, String age, String branch, String phone,String feedbacks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.phone = phone;
        this.feedbacks=feedbacks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(String feedbacks) {
        this.feedbacks = feedbacks;
    }

    public boolean isIsValidate() {
        return isValidate;
    }

    public void setIsValidate(boolean isValidate) {
        this.isValidate = isValidate;
    }
    
    
    
}
