/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.tests;

//import edu.gestudent.Service.ServiceClub;
import edu.gestudent.services.ServiceClub;
import edu.gestudent.services.ServiceEvenement;
import edu.gestudent.entities.Club;
import edu.gestudent.entities.Evenement;
import edu.gestudent.utils.DataBase;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class mainclassNader {

    public static void main(String[] args) {
        ServiceClub ser = new ServiceClub();
        ServiceEvenement ser1 = new ServiceEvenement();

        Club c1 = new Club(1, "evenjjhghj666666666jjjjjjjjt", "1996-04-26", "rotary@gmail.com", 1, "le club est magnifique", 1, 7);

        Evenement e1 = new Evenement(2, "nhebek heegfghjeeeedi", "le film est magnifique", "2020-02-26", "bloc e", 1);

        try {
//         
            //  ser1.ajouter(e1);
            //ser.ajouter(c1);
            //ser1.supprimer(e1);
           // ser.supprimer(c1);
           // ser.Update(0, "evefrnt");
            System.out.println(ser.readAll());
            // List<Club> list = ser.readAll();
            //   System.out.println(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
