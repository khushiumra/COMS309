package com.example.test.users;

import com.example.test.groups.group;

import javax.persistence.*;

@Entity
public class user {

    @Id
    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String role;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "Group")
    private group Group;


    public user(String username,String role, String email, String password){
        this.username = username;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public user() {

    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
