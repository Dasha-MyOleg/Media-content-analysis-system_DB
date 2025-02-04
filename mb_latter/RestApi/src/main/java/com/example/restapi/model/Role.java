package com.example.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name  = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Role() {}
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
