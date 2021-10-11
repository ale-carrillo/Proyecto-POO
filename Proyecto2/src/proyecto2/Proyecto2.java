/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

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
        
        int opc;
        
        do{
            System.out.println("\n\n1) Registro \n2) Reservar \n3) Modificar \n4) Ver \n5) Salir ");
            System.out.print("Elija una opción  ");
            opc=sc.nextInt();
            
            switch(opc){
                case 1: 
                    reg.registro();
                    break;
                case 2:
                    //Reservar.inicializarHab();
                    break;
                case 3:
                    
                    break;
                case 4:
                 reg.ver();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(opc!=5);
    }
    
}
