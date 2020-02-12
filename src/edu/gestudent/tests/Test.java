/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.tests;

import edu.gestudent.entities.user;
import edu.gestudent.services.ServicesUsers;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayadi
 */
public class Test {
        public static void main(String[] args) throws SQLException {
            ServicesUsers su =new ServicesUsers();
             user u = new user("hasen","ayadi","dd.dd@esprit.tn","student","1995-05-06",22901120,"Tunisia","bellvue","female");
            try {
              su.ajouter(u);
              // su.updateimage("171JMTB216","cssphoto");
                //su.delete("171JMT212");
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
           System.out.println(su.readAll());

        }    
    
}
