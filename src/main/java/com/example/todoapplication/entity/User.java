package com.example.todoapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer userId;

    @NotEmpty(message = "First Name cannot be empty or null")
    private String firstName;

    @NotEmpty(message = "Last Name cannot be empty or null")
    private String lastName;

    @Email(message = "The email entered should be valid")
    private String emailAddress;

    @NotEmpty(message = "Date of Birth cannot be empty or null")
    private Date dob;

    public User()
    {
    }

    public User(Integer userId, @NotEmpty(message = "First Name cannot be empty or null") String firstName, @NotEmpty(message = "Last Name cannot be empty or null") String lastName, @Email(message = "The email entered should be valid") String emailAddress, @NotEmpty(message = "Date of Birth cannot be empty or null") Date dob) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dob = dob;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
