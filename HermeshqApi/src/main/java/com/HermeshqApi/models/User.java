package com.HermeshqApi.models;


import javax.persistence.*;

@Entity
@Table(name="STUDENT")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;

    private String Name;  // Changed variable name to follow conventions
    private String Email;
    private String Password;

    public User() {
    }

    public User(Long userID, String name, String email, String password) {
        this.userID = userID;
        Name = name;
        Email = email;
        Password = password;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}