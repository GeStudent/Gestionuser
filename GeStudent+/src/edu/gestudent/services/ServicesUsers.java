/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.services;

import edu.gestudent.entities.user;
import edu.gestudent.utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayadi
 */
public class ServicesUsers {

    private Connection con;
    private Statement ste;

    public ServicesUsers() {
        con = DataBase.getInstance().getConnection();

    }

    String idCode(user u) {
        String code = "1928GE";
        int value=0;
        if (u.getGender() == "male") {
            code = code + "M";
        } else {
            code = code + "F";
        }
        try {
            ste = con.createStatement();
            ResultSet rs = ste.executeQuery("select NEXTVAL(seq_user);");
            while (rs.next()) {
                 value = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        code=code+String.valueOf(value);
        return code;
    }

    public void ajouter(user u) throws SQLException {
        PreparedStatement pre = con.prepareStatement("INSERT INTO user (firstname,lastname,email,roles,birthDay,phone,pays,adress,gender,idCode)VALUES (?,?,?,?,?,?,?,?,?,?);");
        pre.setString(1, u.getFirstname());
        pre.setString(2, u.getLastname());
        pre.setString(3, u.getEmail());
        pre.setString(4, u.getRoles());
        pre.setString(5, u.getBirthDay());
        pre.setInt(6, u.getPhone());
        pre.setString(7, u.getPays());
        pre.setString(8, u.getAdress());
        pre.setString(9, u.getGender());
        pre.setString(10,idCode(u));
        pre.executeUpdate();
    }

    public void ajouterAccount(user u) throws SQLException {
        PreparedStatement pre = con.prepareStatement("update user set username=?,image=?,email=?,password=?,roles=?,enabled=?,?,?,?,?,?);");
        pre.setString(1, u.getUsername());
        pre.setString(2, u.getImage());
        pre.setString(3, u.getEmail());
        pre.setString(4, u.getPassword());
        pre.setString(5, u.getRoles());
        pre.setString(7, u.getPays());
        pre.setString(8, u.getAdress());
        pre.setString(9, u.getGender());
        pre.executeUpdate();
    }

    public boolean delete(String idcode) throws SQLException {

        PreparedStatement pre = con.prepareStatement("Delete from user where idcode=? ;");
        pre.setString(1, idcode);
        if (pre.executeUpdate() != 0) {
            System.out.println("user Deleted");
            return true;
        }
        System.out.println("id user not found!!!");
        return false;

    }

    public boolean updateimage(String idcode, String image) throws SQLException {

        PreparedStatement pre = con.prepareStatement("update user set image =? where idcode=? ;");
        pre.setString(1, image);
        pre.setString(2, idcode);
        if (pre.executeUpdate() != 0) {
            System.out.println("user's image is up to date");
            return true;
        }
        System.out.println("id user not found!!!");
        return false;

    }

    public List<user> readAll() throws SQLException {

        List<user> lu = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select firstname,lastname,email,roles,birthDay,phone,pays,adress,gender from user");
        while (rs.next()) {
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            String roles = rs.getString("roles");
            String birthDay = rs.getString("birthDay");
            int phone = rs.getInt("phone");
            String pays = rs.getString("pays");
            String adress = rs.getString("adress");
            String gender = rs.getString("gender");
            user u = new user(firstname, lastname, email, roles, birthDay, phone, pays, adress, gender);
            lu.add(u);
        }
        return lu;
    }

}
