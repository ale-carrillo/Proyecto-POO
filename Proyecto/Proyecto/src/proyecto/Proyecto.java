
package proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservar res = new Reservar();
        
        int opc;
        
        do{
            System.out.println("\n\n1) Registro \n2) Reservar \n3) Modificar \n4) Ver \n5) Salir ");
            System.out.print("Elija una opción  ");
            opc=sc.nextInt();
            
            switch(opc){
                case 1: 
                    res.registro();
                    break;
                case 2:
                   res.reservacion();
                    break;
                case 3:
                    
                    break;
                case 4:
                 res.ver();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(opc!=5);
        
        
        
        /*
       if(!reservar.containsKey(cliente)){
           reservar.put(cliente, habitacion);
       }else{
           System.out.println("Habitación ocupada");
       } */
    }
    
}
