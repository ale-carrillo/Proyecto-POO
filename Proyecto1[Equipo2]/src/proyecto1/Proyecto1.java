package proyecto1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Proyecto1 {

    public static void main(String[] args) throws ParseException {
        
        // * * * * * * Creación de objeto de la biblioteca Scanner * * * * * * 
        Scanner sc = new Scanner(System.in);
        
        // Creación de una tabla hash -> Clave: numero de cliente, Valor: Objeto Cliente
        Map<Integer,Cliente> reservar = new HashMap<>();
        
        // Creación de un ArrayList -> Contiene objetos de Habitacion
        List<Habitacion> listaHab = new ArrayList<>();
        
        // Creación del conjunto -> Contiene objetos de Actividades
        Set<Actividades> conjunto = new LinkedHashSet<>();  
        
        
        // Creación de objetos de cada clase con el fin de poder ocupar sus métodos corresponientes
        Registro reg = new Registro();
        Habitacion habitacion = new Habitacion();
        Reservar res = new Reservar();
        Visualizar vis = new Visualizar();
        Actividades act = new Actividades();
        
        // Se llama al método inicializar habitación desde antes del menú,
        // para llenar habitaciones aleatorias en la lista
        habitacion.inicializarHab(listaHab); 
     
        int opc;
        
        // Menú de opciones -> Se repite hasta que el usuario decida salir
        do{
            System.out.println("\n  ____________________________________________________________________________\n");
            System.out.println("\t _____________________________________________________________");
            System.out.println("\t|                 BIENVENIDO AL HOTEL SUNSET                  |");
            System.out.println("\t|  1) Registro                                                |");
            System.out.println("\t|  2) Reservar                                                |");
            System.out.println("\t|  3) Modificar                                               |");
            System.out.println("\t|  4) Ver                                                     |");
            System.out.println("\t|  5) Actividades                                             |");
            System.out.println("\t|  6) Salir                                                   |");
            System.out.println("\t _____________________________________________________________");
            System.out.print("\n -> Elija una opción: ");
            opc=sc.nextInt();
            
            switch(opc){
                
                case 1: 
                    // Si el usuario decide Registrarse
                    System.out.println("\n\t__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __");
                    System.out.println("\t\t\t\t   REGISTRO");
                    reg.registro(reservar);
                    break;
                    
                case 2:
                    // Si el usuario decide Reservar
                    System.out.println("\n\t__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __");
                    System.out.println("\t\t\t\t   RESERVAR");
                    res.reserva(habitacion, listaHab, reservar);
                    break;
                    
                case 3:
                    // Si el usuario decide Modificar una fecha
                    System.out.println("\n\t__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __");
                    System.out.println("\t\t\t\t   MODIFICAR\n");
                    habitacion.modificarFechas(listaHab, reservar);
                    break;
                    
                case 4:
                    // Si el usuario decide Ver:
                    // -> clientes registrados
                    // -> reservacion
                    // -> habitaciones ocupadas
                    // -> habitaciones disponibles
                    
                    System.out.println("\n\t__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __");
                    System.out.println("\t\t\t\t   VER\n");
                    vis.eleccion(reservar, listaHab);
                    break;
                    
                case 5:
                    // Si el usuario decide ver Actividades extras que ofrece el hotel
                    System.out.println("\n\t__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __");
                    System.out.println("\t\t\t\t ACTIVIDADES EXTRAS");
                    act.actividades(conjunto);
                    break;
                    
                default:
                    System.out.println("Opción inválida ):");
                    break;
            }
        }while(opc!=6);
    }
}