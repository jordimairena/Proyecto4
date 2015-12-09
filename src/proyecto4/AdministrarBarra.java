/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author jordi
 */
public class AdministrarBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    protected double hora;
    public JLabel label;
    public String orden;
    public JTextField textfield;
     public AdministrarBarra() {
    }

    public AdministrarBarra(JProgressBar barra, double hora, JLabel label,String orden,JTextField textfield) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.hora=hora;
        this.label = label;
        this.orden = orden;
        this.textfield=textfield;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
   
    @Override
    public void run(){
        while (vive){
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
                if (barra.getValue()==hora) {
                    vive=false;
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                
            }
            
        }
        
        barra.setValue(0);
        label.setText("Inactivo");
        textfield.setText("");
        JOptionPane.showMessageDialog(null, "Orden "+orden+" finalizada");
}
    
}
