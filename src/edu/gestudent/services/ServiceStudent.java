/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.services;

import edu.gestudent.entities.Student;
import edu.gestudent.entities.user;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayadi
 */
public class ServiceStudent extends ServicesUsers {

    public ServiceStudent() {
        super();
    }

    public void ajouterStudent(Student s) {

        PreparedStatement pre;
        try {
            super.ajouter(s);
            pre = con.prepareStatement("update user set roles='student' where idcode= ?");
            pre.setString(1, super.getQRcode(s.getEmail()));
            pre.executeUpdate();

        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    

}
