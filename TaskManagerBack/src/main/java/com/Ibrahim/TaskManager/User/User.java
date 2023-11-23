package com.Ibrahim.TaskManager.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="company")
    private String company;

    @Column(name="userRole")
    private UserRole userRole;

    @Column(name="userType")
    private UserType userType;


    public User () {}  



    public User(Long id, String firstName, String lastName, String email, String password, String company, UserRole userRole, UserType userType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.company = company;
        this.userRole = userRole;
        this.userType = userType;
    }



    


    
}
