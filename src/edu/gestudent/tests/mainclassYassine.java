/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.tests;

import edu.gestudent.entities.Student;
import edu.gestudent.services.ServiceStudent;
import edu.gestudent.services.ServicesUsers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayadi
 */
public class mainclassYassine {
    
     public static void main(String[] args) {
         
         Student s =new Student("ayadi","yosra","yosra.ayadi@esprit.tn","1998-02-12",44128252,"Tunisia","Bellvue","Female");
         ServiceStudent usr= new ServiceStudent();
         
         usr.ajouterStudent(s);
         //666
       
        
         
     }
    
}
