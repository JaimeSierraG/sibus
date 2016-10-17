/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sibus;

import ClaseConectar.Conexion;
import visPrincipal.principal;
import conPrincipal.ControladorPrincipal;
import javax.swing.JFrame;
/**
 *
 * @author leninurbina
 */
public class Sibus {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Conexion conex = new Conexion();
        conex.getConexion();
        principal  vistaL = new principal();
        
       // EmpleadoDAO modeloL = new EmpleadoDAO();
        //ControladorLogin controladorL = new ControladorLogin(vistaL, modeloL);
        ControladorPrincipal controlador = new ControladorPrincipal(vistaL);
        //ControladorContabilidad conCont = new ControladorContabilidad(vistaL);
        vistaL.setLocationRelativeTo(null);
        vistaL.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        vistaL.setVisible(true);
        
    }
    
}
