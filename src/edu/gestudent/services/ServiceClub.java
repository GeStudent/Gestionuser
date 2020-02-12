/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.services;

import edu.gestudent.IService.IService;
import edu.gestudent.entities.Club;
import edu.gestudent.utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author user
 */
public class ServiceClub implements IService<Club> {

    private Connection con;
    private Statement ste;

    public ServiceClub() {
        con = DataBase.getInstance().getConnection();

    }

    @Override
    public void ajouter(Club c) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `club` (`id_club`, `nom`, `date`, `email`,`numero`,`description`,`etat`,`id_president`) VALUES (NULL, '" + c.getNom() + "', '" + c.getDate() + "', '" + c.getEmail() + "','" + c.getNumero() + "','" + c.getDescription() + "','" + c.getEtat() + "','" + c.getId_president() + "');";
        ste.executeUpdate(requeteInsert);
    }

    @Override
    public boolean delete(Club c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Club c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Club> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean supprimer(Club c) throws SQLException {

        String reqeute = "delete  from Club  where (nom = ?) ";
        try {
            PreparedStatement pst = con.prepareStatement(reqeute);
            pst.setString(1, c.getNom());
            // pst.setString(2, m.setDescription(reqeute));
            if (pst.executeUpdate() != 0) {
                System.out.println("Club deleted");
            }
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
//To change body of generated methods, choose Tools | Templates.
    }
    public boolean Update(int etat, String nom) throws SQLException {

        String requete = "UPDATE Club SET  etat= ? where nom = ? ;";
        try {
            PreparedStatement pst = con.prepareStatement(requete);
//            pst.setInt(1, m.getId());

            pst.setInt(1, etat);
            pst.setString(2, nom);
            if (pst.executeUpdate() != 0) {
                System.out.println("Club Updated");
            } else {
                System.out.println("non");
            }
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return false;
    }
        
}