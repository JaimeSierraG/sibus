/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modPrincipal;

import ClaseConectar.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author leninurbina
 */
public class ModeloPrincipalDAO {
    Conexion myConexion ;
    ModeloPrincipal permisos = null;
    PreparedStatement ps = null;
    String cSQL = "";
    
     public ModeloPrincipalDAO () {
        myConexion = new Conexion();
    }
    
     public ModeloPrincipal primerRegistro(ModeloPrincipal principal)  throws SQLException {
        
        Connection accesoDB = myConexion.getConexion();
        this.permisos = principal;
        cSQL = " SELECT id_padre, id_permiso, id FROM sg_permisos  ORDER BY id  LIMIT 1;";
        
        try {
            Statement st = accesoDB.createStatement();
            ResultSet rs = st.executeQuery(cSQL);
            
            if(rs.next()){
                permisos.setcId_padre(rs.getString(1));
                permisos.setcId_permiso(rs.getString(2));
                permisos.setcId(rs.getString(3));
                return permisos;
            }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null,  "Error en instruccion sql" + e.getMessage() +cSQL, "Error de conexion", JOptionPane.INFORMATION_MESSAGE );
            ps.close();
            accesoDB.close();
         } finally {
            if(ps != null || ps != null) {
                ps.close();
                accesoDB.close();
            }            
        }
         
        return permisos;
         
    }

}
