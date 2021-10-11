package proyecto1;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Reservar {
    
    // * * * * * * Creación de objeto de la biblioteca Scanner * * * * * * 
    Scanner sc = new Scanner(System.in);
    
    // * * * * * * Creación de objetos de clases * * * * * * 
    Fechas fech = new Fechas();
    Visualizar vis = new Visualizar();
    
    // * * * * * * Atributos de Reservar * * * * * *
    String inicial;
    String finall;
    
    // Método Reserva -> Pide los datos de la habitación donde se va a hospedar el usuario
    // Tiene como parametro la tabla Hash y La lista creada en la clase "Proyecto1", 
    // además del objeto habitación creado en este mismo
    public void reserva(Habitacion hab, List<Habitacion> listaHab, Map<Integer,Cliente> reservar) throws ParseException{
        vis.detalles();
        System.out.println(" ___   ___   ___   ___   ___   ___");
        System.out.println("\n¿Qué desea hacer? ");
        System.out.println("  1. Reservar\n  2. Salir");
        System.out.print("-> ");
        int op = sc.nextInt();
        System.out.println("\n ___   ___   ___   ___   ___   ___\n");
        
        // Menú de opciones -> Reservar o Salir
        switch(op){
            case 1:
                System.out.println("\n\n\tReservar");
                System.out.println("________________________");
                hab.imprimirDisponibles(listaHab);
                System.out.print("\nSelecciona una habitación: ");
                int numHab = sc.nextInt();
                
                if(seEncuentra(listaHab, numHab)){ // Se verifica si existe la habitación
                    if(estaDisponible(listaHab, numHab)){ // Se verifica si esta disponible la habitación
                        System.out.print("Ingresa tu número de cliente: ");
                        int clave = sc.nextInt();
                        if(reservar.containsKey(clave)){ // Se verifica que la clave exista
                            hab.juntar(listaHab, reservar, numHab, clave,reservar.get(op).getNombre());
                            System.out.println("\n\t\t\t* * * * * * * * * * * * * *");
                            System.out.println("\t\t\t* Habitación reservada (: *");
                            System.out.println("\t\t\t* * * * * * * * * * * * * *");
                        }else{
                            System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * * * * * * * *");
                            System.out.println("\t\t\t* Lo siento, no existe el número de cliente   *");
                            System.out.println("\t\t\t* Registrate primero (:                       *");
                            System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * *");
                        }
                    }
                    else{
                        System.out.println("\n\t\t\t* * * * * * * * * * * * * * *");
                        System.out.println("\t\t\t* Habitación no disponible  *");
                        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
                    }
                }
                else{
                    System.out.println("\n\t\t\t* * * * * * * * * * * * * * * *");
                    System.out.println("\t\t\t* Habitación no existente ):  *");
                    System.out.println("\t\t\t* * * * * * * * * * * * * * * *");
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
    
    // Método "Se encuentra" -> Verifica si se encuentra el número de habitación en la lista
    // Tiene como parametro la habitación a buscar y la lista creada en el "Proyecto1"
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
    
    // Método "Esta Disponible" -> Verifica que el número de habitación en la lista este disponible
    // Tiene como parametro la habitación a buscar y la lista creada en el "Proyecto1"
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

}
