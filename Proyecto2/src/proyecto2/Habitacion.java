/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Map;
/**
 *
 * @author aleja
 */
public class Habitacion {
    private int numeroH;
    private boolean disponible;
    private Integer clave;
    //private int reservar;
    public Habitacion(){}
    
    public Habitacion(int numeroH, boolean disponible, Integer clave){
        this.numeroH = numeroH;
        this.disponible = disponible;
        this.clave = clave;
        //this.reservar = reservar.keySet();
    }
    
    public int getNumero(){
        return numeroH;
    }
    
    public boolean getDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean reservada){
        this.disponible = disponible;
    }
}
