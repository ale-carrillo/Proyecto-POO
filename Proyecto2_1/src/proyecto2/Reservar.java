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
    Fechas fech = new Fechas();
    Visualizar vis = new Visualizar();
    Scanner sc = new Scanner(System.in);
    String inicial;
    String finall;
    
    public void reserva(Habitacion hab, List<Habitacion> listaHab, Map<Integer,Cliente> reservar){
        vis.detalles();
        System.out.println("");
        System.out.println("\n 1. Reservar\n 2. Salir");
        System.out.println("¿Qué desea hacer? ");
        int op;
        op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Reservar");
                hab.imprimirDisponibles(listaHab);
                System.out.println("Selecciona una habitación: ");
                int numHab = sc.nextInt();
                
                if(seEncuentra(listaHab, numHab)){
                    if(estaDisponible(listaHab, numHab)){
                        System.out.print("Ingresa tu número de cliente: ");
                        int clave = sc.nextInt();
                        if(reservar.containsKey(clave)){
                            hab.juntar(listaHab, reservar, numHab, clave);
                            
                            /*
                            System.out.print("Fecha inicio con formato dd/MM/yy: ");
                            finicial = sc.nextLine();
                            System.out.print("Fecha final con formato dd/MM/yy: ");
                            fechaFinal = sc.nextLine();
                            */
                        }else{
                            System.out.println("No existe la clave, registrate primero (:");
                        }
                    }
                    else{
                        System.out.println("No esta disponible");
                    }
                }
                else{
                    System.out.println("No hay, no existe :(");
                }

                
                
                break;
            case 2:
                System.out.println("Salir");
                break;
            default:
                System.out.println("No existe la opción ):");
                break;
                
        }
    }

    public boolean estaDisponible(List<Habitacion> listaHab, int numHab){
        boolean auxiliar = false;
            for(Habitacion habb: listaHab){
                int numHabGet = habb.getNumero();
                if(numHabGet == numHab){
                    boolean disponibleGet = habb.getDisponible();
                    if(disponibleGet){
                        auxiliar = true;
                        return auxiliar;
                    }
                }
            }
        return auxiliar;
    }
               
    public boolean seEncuentra(List<Habitacion> listaHab, int numHab){
        boolean auxiliar = false;
                for(Habitacion habb: listaHab){
                    int numHabGet = habb.getNumero();
                    if(numHabGet == numHab){
                        auxiliar = true;
                        return auxiliar;
                    }
                }
            return auxiliar;
    }
}
