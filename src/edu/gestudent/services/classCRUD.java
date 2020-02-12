/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gestudent.services;

//import edu.gestudent.Iservice.Icrud;
import edu.gestudent.IService.Icrud;
import edu.gestudent.entities.classe;
import edu.gestudent.entities.cours;
import edu.gestudent.utils.DataBase;
//import edu.gestudent.utils.myconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHIKHAOUI NOUHA
 */
public class classCRUD implements Icrud<classe> {

    private Connection con;
    private Statement ste;

    public classCRUD() {
        con = DataBase.getInstance().getConnection();

    }


    public void ajouter(classe cl) throws SQLException
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `class` ( `nameC` ) VALUES (  ?);");
    pre.setString(1, cl.getNameC());
   ;
    pre.executeUpdate();
    }
            

    
    public boolean delete(classe cl) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public boolean update(classe cl) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    public List<classe> readAll() throws SQLException {
    List<classe> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from class");
     while (rs.next()) {                
               int idclass=rs.getInt(1);
               String nameC=rs.getString("nameC");
             
               classe cl=new classe( nameC,idclass);
     arr.add(cl);
     }
    return arr;
    }
}
