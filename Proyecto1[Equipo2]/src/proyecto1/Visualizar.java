package proyecto1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Visualizar {
    
    // * * * * * * Creación de objeto de la biblioteca Scanner * * * * * * 
    Scanner sc = new Scanner(System.in); 
    
    // * * * * * * Creación de objeto de la clase Habitación * * * * * * 
    Habitacion hab = new Habitacion();   
    
    // Método elección -> Es un menpu de opciones para elegir que se quiere ver: clientes registrados, reservación, habitaciones ocupadas o disponibles
    // Tiene como parámetro la tabla Hash y la lista creada en "Proyecto1"
    public void eleccion(Map<Integer,Cliente> reservar, List<Habitacion> listaHab){
	System.out.print("  1. Ver clientes registrados\n  2. Ver reservacion\n  3. Ver habitaciones ocupadas\n  4. Ver habitaciones disponibles");
	System.out.print("\n¿Qué quieres ver? ");
        int op = sc.nextInt();
        switch(op){
            case 1:
                verCliente(reservar);
                break;
            case 2:
                verReservacion(reservar, listaHab);
                break;
            case 3:
                hab.imprimirOcupadas(listaHab);
                break;
            case 4:
                hab.imprimirDisponibles(listaHab);
                break;
        }
    }

    // Método Ver Reservación -> Imprime todas las habitaciónes, disponibles o no
    // Tiene como parámetro la tabla Hash y la lista creada en la clase "Proyecto1"
    public void verReservacion(Map<Integer,Cliente> reservar, List<Habitacion> listaHab){
        System.out.println("\n\t\tReservaciones");
        System.out.println("________________________\n");
        for(Habitacion hab: listaHab){
            hab.imprimirHabitacion();
            System.out.println("________________________\n");
        }
    }
    
    // Método Ver Cliente -> Imprime todos los clientes registrados en el hotel, solo con su número de cliente y nombre
    // Tiene como parámetro la tabla Hash creada en la clase "Proyecto1"
    public void verCliente(Map<Integer,Cliente> reservar){        
        if(reservar.isEmpty()){
            System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * *");
            System.out.println("\t\t\t* No hay clientes registrados ):  *");
            System.out.println("\t\t\t* * * * * * * * * * * * * * * * * *");
        }else{
            System.out.println("\n\t\tClientes");
            System.out.println("________________________\n");
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Cliente: "+entry.getKey());
                System.out.println("Nombre: "+entry.getValue().getNombre());
                System.out.println("________________________\n");
            }
        }
    }

    // Método Detalles -> Imprime los detalles de cada habitación al momento de reservar
    // Es un menú de opciones para que el usuario decida que tipo de habitación quiere ver
    public void detalles(){
        int respuesta = 1;
        do{
            System.out.println("\n ___   ___   ___   ___   ___   ___\n");
            System.out.println(" * TIPOS DE HABITACIONES *");
            System.out.print("  1. Pent House\n  2. Suite Principal\n  3. Compartida\n  4. Familiar\n  5. Matrimonial\n  6. Doble\n  7. Sencilla\n");
            System.out.print("\n¿Qué habitación deseas ver? ");
            int opc = sc.nextInt();
            System.out.println(" ___   ___   ___   ___   ___   ___\n");
            System.out.println("\t- DETALLES -");
            switch(opc){
                case 1:
                    System.out.print(" -> Vista al mar\n -> Piso completo\n -> 3 cuartos con cama KingSize y Baño con tina\n -> Bar\n -> Videojuegos\n -> Yacuzzi\n -> Cocina equipada\n -> Comedor\n -> Servicio se spa\n -> Terraza privada\n -> Precio: $10,500 por noche\n");
                    break;
                case 2:
                    System.out.print(" -> Vista al mar\n -> Cama KingSize\n -> Baño con tina\n -> Bar\n -> Videojuegos\n -> Yacuzzi\n -> Cocina equipada\n -> Comedor\n -> Servicio se spa\n -> Terraza privada\n -> Precio: $7,890 por noche\n");
                    break;
                case 3:
                    System.out.print(" -> Vista al mar\n -> Dos camas queen\n -> Dos baños\n -> Posibilidad de conectar hasta tres recamaras\n -> Cocineta\n -> Videojuegos\n -> Precio: $4,980 por noche\n");
                    break;
                case 4:
                    System.out.print(" -> Vista al mar o al centro de la ciudad\n -> Dos baños\n -> Dos camas queen y un sofa cama matrimonial\n -> Cocineta\n -> Videojuegos\n ->Precio: $4,000 por noche\n");
                    break;
                case 5:
                    System.out.print(" -> Vista a la alberca o al centro de la ciudad\n -> Cama matrimonial\n -> Un baño\n -> Cocineta\n -> Precio: $3,500 por noche\n");
                    break;
                case 6:
                    System.out.print(" -> Vista a la alberca o al centro de la ciudad\n -> Dos camas matrimoniales\n -> Un baño\n -> Cocineta\n -> Precio: $2,500 por noche\n");
                    break;
                case 7:
                    System.out.print(" -> Vista a la alberca o al centro de la ciudad\n -> Cama matrimonian\n -> Banio\n -> Cocineta\n -> Precio: $1,200 por noche\n");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("\n\n¿Quieres ver otra habitacion? ");
            System.out.println("  1. Si\n  2. No");
            System.out.print("-> ");
            
            respuesta = sc.nextInt();
        }while(respuesta == 1);
    }
}
