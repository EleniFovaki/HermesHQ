package com.HermeshqApi.models;

import javax.persistence.*;

@Entity
@Table(name= "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;

    private String Name;
    private String Email;
    private String password;  // Corrected variable name

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;  // Corrected getter
    }

    public void setPassword(String password) {
        this.password = password;  // Corrected setter
    }
}
