package com.enzo.bodyclient.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // Spécifie la collection MongoDB
public class User {
    @Id
    private String id;
    private String lastName;
    private String firstName;
    private String type;
    private String abonnementType;

    public User() {
    }

    public User(String lastName, String firstName, String type, String abonnementType) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.type = type;
        this.abonnementType = abonnementType;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbonnementType() {
        return abonnementType;
    }

    public void setAbonnementType(String abonnementType) {
        this.abonnementType = abonnementType;
    }
}