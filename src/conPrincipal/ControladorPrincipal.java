/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conPrincipal;

import modPrincipal.ModeloPrincipalDAO;
import MenuSecundario.Contabilidad.pnlConTipoPolizas;
import visMenuPrincipal.elementos.pnlConfiguracion;
import visMenuPrincipal.elementos.pnlContabilidad;
import visMenuPrincipal.elementos.pnlInicio;
import visMenuPrincipal.elementos.pnlTalentoHumano;
import visPrincipal.principal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modPrincipal.ModeloPrincipal;

/**
 *
 * @author leninurbina
 */
public class ControladorPrincipal  implements ActionListener {
    
    private final ModeloPrincipalDAO modeloPrincipal = new ModeloPrincipalDAO();
    private final ModeloPrincipal principal =new ModeloPrincipal();
    pnlContabilidad pContabilidad = new pnlContabilidad();
    pnlConfiguracion pConfiguracion = new pnlConfiguracion();
    principal vPrincipal = new principal();
    pnlConTipoPolizas ptipoPolizas = new pnlConTipoPolizas();
   
     
    public ControladorPrincipal(principal vprincipal){
        
        this.vPrincipal = vprincipal;
        
        char espac, espac1, espac2 = 0;
        boolean menu = true;
        
        pnlInicio pin = new pnlInicio();
        pin.setSize(61,20);
        pin.setLocation(5,2);
        vprincipal.pnlMenuPrincipal.add(pin,BorderLayout.CENTER);
        vprincipal.pnlMenuPrincipal.revalidate();
        Dimension espacio = pin.getSize();
        espac = (char) espacio.width;
        
        if(menu == true){
            pContabilidad.setSize(104,20);
            pContabilidad.setLocation(espacio.width + 5,2);
            vprincipal.pnlMenuPrincipal.add(pContabilidad,BorderLayout.CENTER);
            vprincipal.pnlMenuPrincipal.revalidate();
            Dimension espacio1 = pContabilidad.getSize();
            espac1 = (char) espacio1.width;
            //pcon.btnContabilidad.addActionListener(this);
        }else{
            espac1 = 0;
        }
        
        pConfiguracion.setSize(112,20);
        pConfiguracion.setLocation(espac1 + espac + 5,2);
        vprincipal.pnlMenuPrincipal.add(pConfiguracion,BorderLayout.CENTER);
        vprincipal.pnlMenuPrincipal.revalidate();
        vprincipal.pnlMenuPrincipal.repaint();
        
        
        Dimension espacio2 = pConfiguracion.getSize();
            espac2 = (char) espacio2.width;
        
        pnlTalentoHumano pth = new pnlTalentoHumano();
        pth.setSize(128,20);
        pth.setLocation(espac1 + espac + espac2 + 5,2);
        vprincipal.pnlMenuPrincipal.add(pth,BorderLayout.CENTER);
        vprincipal.pnlMenuPrincipal.revalidate();
        vprincipal.pnlMenuPrincipal.repaint();          
        addListener();
        
        
    }

    
    public void InicializarPantallaPrincipal(){
    
    }
    
    private void addListener(){
        pContabilidad.getBtnContabilidad().addActionListener(this);
        pConfiguracion.getBtnConfiguracion().addActionListener(this);
        
    }
    public void actionPerformed (ActionEvent e){
    if(e.getSource() == pContabilidad.getBtnContabilidad()){       
       ptipoPolizas.setSize(161,20);     
       vPrincipal.pnlMenuSecundario.removeAll();
       vPrincipal.pnlMenuSecundario.add(ptipoPolizas,BorderLayout.CENTER);
       vPrincipal.pnlMenuSecundario.validate();
       vPrincipal.pnlMenuSecundario.repaint(); 
        try {
            modeloPrincipal.primerRegistro(principal);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       JOptionPane.showMessageDialog(vPrincipal, principal.getcId_permiso());
    }else if(e.getSource() == pConfiguracion.getBtnConfiguracion()){
       vPrincipal.pnlMenuSecundario.removeAll();
       vPrincipal.pnlMenuSecundario.repaint(); 
    }
    }

}
