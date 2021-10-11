/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Registro {
    String nombre;
    int edad,hab;
    static int numClientes = 0;
    
    Scanner sc = new Scanner(System.in);
//    Map<Integer,Cliente> reservar = new HashMap<>();
    //ArrayList <Cliente> clientes = new ArrayList <>();

    
    public void registro(Map<Integer,Cliente> reservar){
        System.out.print("\nIngresa el nombre: ");
            nombre=sc.nextLine();
        System.out.print("Edad: ");
            edad=sc.nextInt();
            if(edad>=18){
                sc.nextLine();
                numClientes ++;

                Cliente nuevoCliente = new Cliente(nombre, edad);

                if(!reservar.containsKey(hab)){
                     reservar.put(numClientes,nuevoCliente);
                     System.out.println("\n\t Ya estas registrado (:     \n\t Tu número de cliente es: "+numClientes);
                }else{
                   System.out.println("Ya está ocupada la habitación");
                }                
            }else{
                System.out.println("No te puedes registrar, ya que eres menor de edad ):");
            }

        
    }
    
    public void ver(Map<Integer,Cliente> reservar){
        
        if(reservar.isEmpty()){
            System.out.println("No hay clientes registrados ):");
        }else{
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Cliente: "+entry.getKey());
                System.out.println("Nombre: "+entry.getValue().getNombre());
                System.out.println("Edad: "+entry.getValue().getEdad());
                //System.out.println("Fecha: "+entry.getValue().getFecha());
            }
        }
    }
}
