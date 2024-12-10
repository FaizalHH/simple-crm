package com.example.simple_crm;

import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Customer {


    //---------------this is from lesson 3.10-----------------------------
    private final String id = UUID.randomUUID().toString();
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private String jobTitle;
    private int yearOfBirth;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // private String id;
    // private String firstName;
    // private String lastName;
    // private String email;
    // private String contactNo;
    // private String jobTitle;
    // private int yearOfBirth;

    // public Customer() {
    // }


    //---------------this is for lesson 3.9-----------------------------

    // public Customer(String id, String firstName, String lastName, String email, String contactNo, String jobTitle,
    //     int yearOfBirth) {
    //   this.id = id;
    //   this.firstName = firstName;
    //   this.lastName = lastName;
    //   this.email = email;
    //   this.contactNo = contactNo;
    //   this.jobTitle = jobTitle;
    //   this.yearOfBirth = yearOfBirth;
    // }
  
    // public String getId() {
    //   return this.id;
    // }
  
    // public void setId(String id) {
    //   this.id = id;
    // }
  
    // public String getFirstName() {
    //   return this.firstName;
    // }
  
    // public void setFirstName(String firstName) {
    //   this.firstName = firstName;
    // }
  
    // public String getLastName() {
    //   return this.lastName;
    // }
  
    // public void setLastName(String lastName) {
    //   this.lastName = lastName;
    // }
  
    // public String getEmail() {
    //   return this.email;
    // }
  
    // public void setEmail(String email) {
    //   this.email = email;
    // }
  
    // public String getContactNo() {
    //   return this.contactNo;
    // }
  
    // public void setContactNo(String contactNo) {
    //   this.contactNo = contactNo;
    // }
  
    // public String getJobTitle() {
    //   return this.jobTitle;
    // }
  
    // public void setJobTitle(String jobTitle) {
    //   this.jobTitle = jobTitle;
    // }
  
    // public int getYearOfBirth() {
    //   return this.yearOfBirth;
    // }
  
    // public void setYearOfBirth(int yearOfBirth) {
    //   this.yearOfBirth = yearOfBirth;
    // }
}
