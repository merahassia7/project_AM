package com.example.umbbmobguide;
import java.io.Serializable;

public class Department implements Serializable {
    public String name;
    public String description;
    public String phone;
    public String email;
    public String location;

    public Department(String name, String description, String phone, String email, String location) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }
}