package proyecto1;

import java.util.Map;
import java.util.Scanner;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Registro {
    
    // * * * * * * Creación de objeto de la biblioteca Scanner * * * * * * 
    Scanner sc = new Scanner(System.in);    
    
    // * * * * * * Atributos de Registro * * * * * *
    String nombre;
    int edad,hab;
    static int numClientes = 0; // Variable de clase -> Va contando el número de clientes que se van registrando
    
    // Método Registro -> Pide los datos personales del usuario
    // Tiene como parametro la tabla hash creada en la clase "Proyecto1"
    public void registro(Map<Integer,Cliente> reservar){
        
        System.out.print("\nIngresa el nombre: ");
        nombre=sc.nextLine();
        System.out.print("Edad: ");
        edad=sc.nextInt();
        
        // Si la edad es menor que 18, no dejará registrar al usuario
        if(edad>=18){
            sc.nextLine();
            numClientes ++;
            
            // Creación del objeto Nuevo Cliente
            Cliente nuevoCliente = new Cliente(nombre, edad);

            if(!reservar.containsKey(hab)){
                 reservar.put(numClientes,nuevoCliente); // Se agrega el objeto Cliente creado a la tabla hash
                 System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * *");
                 System.out.println("\t\t\t* Ya estas registrado (:        *");
                 System.out.println("\t\t\t* Tu número de cliente es: "+numClientes+"    *");
                 System.out.println("\t\t\t* * * * * * * * * * * * * * * * *");
            }else{
               System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * * *");
               System.out.println("\t\t\t* Ya está ocupada la habitación ):  *");
               System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * *");
            }                
        }else{
            System.out.println("\n\t\t\t* * * * * * * * * * * * * *");
            System.out.println("\t\t\t* No te puedes registrar  *");
            System.out.println("\t\t\t* eres menor de edad ):   *");
            System.out.println("\t\t\t* * * * * * * * * * * * * *");
        }    
    }
    
    // Método Ver -> Imprime los datos de cada objeto de la tabla Hash
    // Tiene como parametro la tabla hash creada en la clase "Proyecto1"
    public void ver(Map<Integer,Cliente> reservar){               
        // Se verifica si la lista esta vacia
        if(reservar.isEmpty()){
            System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * *");
            System.out.println("\t\t\t* No hay clientes registrados ):  *");
            System.out.println("\t\t\t* * * * * * * * * * * * * * * * * *");
        }else{
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Cliente: "+entry.getKey());
                System.out.println("Nombre: "+entry.getValue().getNombre());
                System.out.println("Edad: "+entry.getValue().getEdad());
            }
        }
    }
    
}
