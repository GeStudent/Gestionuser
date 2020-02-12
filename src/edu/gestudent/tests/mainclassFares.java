/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.tests;

import edu.gestudent.entities.Emprunt;
import edu.gestudent.entities.Livre;
import edu.gestudent.services.EmpruntCrud;
import edu.gestudent.services.LivreCrud;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class mainclassFares {

    public static void main(String[] args) {
        LivreCrud lcr = new LivreCrud();
        Livre l = new Livre("yassine", "/image", "jhon jacke roseau", "/http:", "biographique", 12);
        // lcr.ajouterLivre(l);
        // System.out.println(lcr.afficherlivre());
        EmpruntCrud emc = new EmpruntCrud();
        Emprunt e = new Emprunt("2020-12-12", "2021-12-25", 1, 2);
        try {
            //emc.ajouterEmprunt(e);
            emc.supprimeremprunt(e, 2);
        } catch (SQLException ex) {
        }
        System.out.println(emc.getquantite(23));
        
        

    }

}
