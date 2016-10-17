/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modPrincipal;

import java.sql.PreparedStatement;

/**
 *
 * @author leninurbina
 */
public class ModeloPrincipal {
    String cId ;
    String cId_permiso ;
    String cId_padre;

   
    
    public ModeloPrincipal() {
        cId = " ";
        cId_permiso = " ";
        cId_padre = " ";
     
    }

    public String getcId() {
        return cId;
    }

    public String getcId_permiso() {
        return cId_permiso;
    }

    public String getcId_padre() {
        return cId_padre;
    }
     public void setcId(String cId) {
        this.cId = cId;
    }

    public void setcId_permiso(String cId_permiso) {
        this.cId_permiso = cId_permiso;
    }

    public void setcId_padre(String cId_padre) {
        this.cId_padre = cId_padre;
    }
}
