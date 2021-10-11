/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Visualizar {
        Scanner sc = new Scanner(System.in); 
        Habitacion hab = new Habitacion();

    public void eleccion(Map<Integer,Cliente> reservar, List<Habitacion> listaHab){
	System.out.print("1. Ver clientes registrados\n2. Ver reservacion\n3. Ver habitaciones ocupadas\n4. Ver habitaciones disponibles");
	System.out.print("\nQue quieres ver? ");
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

    public void verReservacion(Map<Integer,Cliente> reservar, List<Habitacion> listaHab){
        for(Habitacion hab: listaHab){
            hab.imprimirHabitacion();
        }
    }
    
    public void verCliente(Map<Integer,Cliente> reservar){        
        if(reservar.isEmpty()){
            System.out.println("No hay clientes registrados ):");
        }else{
            for(Map.Entry< Integer, Cliente> entry: reservar.entrySet()){
                System.out.println("Cliente: "+entry.getKey());
                System.out.println("Nombre: "+entry.getValue().getNombre());
            }
        }
    }

	public void detalles(){
            int respuesta = 1;
            do{
                System.out.println("\n\t----TIPOS DE HABITACIONES----");
                System.out.print("1. Pent House\n2. Suite Principal\n3. Compartida\n4. Familiar\n5. Matrimonial\n6. Doble\n7. Sencilla\n");
                int opc = sc.nextInt();
                System.out.println("--DETALLES--");
                switch(opc){
                    case 1:
                        System.out.print("Vista al mar\nPiso completo\n3 cuartos con cama KingSize y Baño con tina\nBar\nVideojuegos\nYacuzzi\nCocina equipada\nComedor\nServicio se spa\nTerraza privada\nPrecio: 10500 por noche\n");
                        break;
                    case 2:
                            System.out.print("Vista al mar\nCama KingSize\nBañso con tina\nBar\nVideojuegos\nYacuzzi\nCocina equipada\nComedor\nServicio se spa\nTerraza privada\nPrecio: 7890 por noche\n");
                            break;
                    case 3:
                            System.out.print("Vista al mar\nDos camas queen\nDos banios\nPosibilidad de conectar hasta tres recamaras\nCocineta\nVideojuegos\nPrecio: 4980 por noche\n");
                            break;
                    case 4:
                            System.out.print("Vista al mar o al centro de la ciudad\nDos banios\nDos camas queen y un sofa cama matrimonial\nCocineta\nVideojuegos\nPrecio: 4000 por noche\n");
                            break;
                    case 5:
                            System.out.print("Vista a la alberca o al centro de la ciudad\nCama matrimonial\nUn banio\nCocineta\nPrecio: 3500 por noche\n");
                            break;
                    case 6:
                            System.out.print("Vista a la alberca o al centro de la ciudad\nDos camas matrimoniales\nUn banio\nCocineta\nPrecio: 2500 por noche\n");
                            break;
                    case 7:
                            System.out.print("Vista a la alberca o al centro de la ciudad\nCama matrimonian\nBanio\nCocineta\nPrecio: 1200 por noche\n");
                            break;

                    default:
                            System.out.println("Opcion invalida");
                            break;
                }
                System.out.println("\n\nQuieres ver otra habitacion?\n1. Si\n2. No\n");
                respuesta = sc.nextInt();
        }while(respuesta == 1);
    }
}
