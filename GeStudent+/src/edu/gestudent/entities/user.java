/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.entities;

import java.sql.Date;

/**
 *
 * @author Ayadi
 */
public class user {
	 String username;
	 String lastname; 
	 String firstname;
         String image;
	 String email;
         String	password ;
         String confirmation_token;
         String roles ;
         String birthDay ;
	 int phone ;
	 String pays ;
	 String adress ;
         String gender;
         String idclass;

    public user(String lastname, String firstname, String email, String roles, String birthDay, int phone, String pays, String adress, String gender) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.roles = roles;
        this.birthDay = birthDay;
        this.phone = phone;
        this.pays = pays;
        this.adress = adress;
        this.gender = gender;
    }

    public user(String username, String image, String email, String password) {
        this.username = username;
        this.image = image;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdclass() {
        return idclass;
    }

    public void setIdclass(String idclass) {
        this.idclass = idclass;
    }

    @Override
    public String toString() {
        return "user{" + "username=" + username + ", lastname=" + lastname + ", firstname=" + firstname + ", image=" + image + ", email=" + email + ", password=" + password + ", confirmation_token=" + confirmation_token + ", roles=" + roles + ", birthDay=" + birthDay + ", phone=" + phone + ", pays=" + pays + ", adress=" + adress + ", gender=" + gender + ", idclass=" + idclass + '}';
    }
    
}
