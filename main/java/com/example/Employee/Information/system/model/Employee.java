package com.example.Employee.Information.system.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;



@Entity
@Table(name = " employees")

public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column (name = "first_name")
    private String firstName;


    @Column (name = "last_name")
    private String lastName;
    @Column (name = "position")
    private String position;


    @Column (name = "phone_number")
    private String phoneNumber;


    @Column (name = "email")
    private String email;


    public Employee() {
    }





    public Employee(String firstName, String lastName, String position, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getFirstName(){
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


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }


    public void setEmailId(String email) {
        this.email = email;
    }
}
