package com.HermeshqApi;

@Entity
@Table(name= "User")
public class User {
    @Id
    @GeneratedValue
    private long userID;
    public String Name;
    private String Email;
    private String Password;

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
        return Password;
    }

    public void setPassword(String password) {
        this.Password = Password;
    }
}



