/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Registro reg = new Registro();
        Habitacion habitacion = new Habitacion();
        Reservar res = new Reservar();
        Visualizar vis = new Visualizar();
        List<Habitacion> listaHab = new ArrayList<Habitacion>();
        habitacion.inicializarHab(listaHab);
        Map<Integer,Cliente> reservar = new HashMap<>();
        
        int opc;
        
        do{
            System.out.println("\n__________________________________________________________");
            System.out.println("\t\tBIENVENIDO AL HOTEL POO xd");
            System.out.println(" 1) Registro \n 2) Reservar \n 3) Modificar \n 4) Ver \n 5) Salir ");
            System.out.print("-> Elija una opción: ");
            opc=sc.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("\tRegistro");
                    reg.registro(reservar);
                    break;
                case 2:
                    System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("\tReservar");
                    res.reserva(habitacion, listaHab, reservar);
                    break;
                case 3:
                    System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("\tModificar");
                    habitacion.modificarFechas(listaHab, reservar);
                    break;
                case 4:
                    System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("\tVer");
                    vis.eleccion(reservar, listaHab);
                    break;
                default:
                    System.out.println("Opción inválida ):");
                    break;
            }
        }while(opc!=5);
    }
}
