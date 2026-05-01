package com.example.umbbmobguide;
import java.util.ArrayList;
import java.io.Serializable;

public class Faculty implements Serializable {
    public String name;
    public String description;
    public ArrayList<Department> departments;

    public Faculty(String name, String description, ArrayList<Department> departments) {
        this.name = name;
        this.description = description;
        this.departments = departments;
    }
}