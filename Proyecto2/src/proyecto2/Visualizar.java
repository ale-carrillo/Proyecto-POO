/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Visualizar {
    
    public int eleccion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres ver?");
	System.out.print("1. Ver clientes registrados\n2. Ver reservacion\n3. Ver habitaciones ocupadas\n4. Ver habitaciones disponibles");
	int op = sc.nextInt(); 
	return op;
    }
    
    public Visualizar(){
		do{
			
		}
                while(respuesta==1);
    }
    
    public void verCliente(){
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Nombre: "+entry.getValue().getNombre());
            }
    }
    public void verReservacion(){
        
    }
    
    public void ver(){
        
        if(reservar.isEmpty()){
            System.out.println("No hay clientes registrados ):");
        }else{
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Cliente: "+entry.getKey());
                System.out.println("Nombre: "+entry.getValue().getNombre());
                System.out.println("Edad: "+entry.getValue().getEdad());
                System.out.println("Fecha: "+entry.getValue().getFecha());
            }
        }
    }
}
