/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong3;

/**
 *
 * @author PC
 */
public class Person {
     private String name, dob, pob, email, phone;
    private char gender;
    //constructor
    public Person() {
    }

    public Person(String name, String dob, String pob, String email, String phone, char gender) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }
    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGener() {
        return gender;
    }

    public void setGener(char gener) {
        this.gender = gener;
    }
    //display
    @Override
    public String toString() {
        return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", email=" + email + ", phone=" + phone
                + ", gener=" + gender + "]";
    }
    
}
