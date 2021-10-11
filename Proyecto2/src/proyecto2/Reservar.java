/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Reservar {
    List<Habitacion> listaHab = new ArrayList<Habitacion>(); 
    
    public void inicializarHab(){
        Habitacion nuevaHab = new Habitacion();
        for(int i = 0; i<100; i++){
            listaHab.add(i, nuevaHab);
        }        
    }

}
