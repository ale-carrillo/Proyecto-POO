
package proyecto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reservar {
    String nombre;
    int edad,hab;
    String fecha;
    
    Scanner sc = new Scanner(System.in);
    Map<Integer,String> reservar = new HashMap<>();
    ArrayList <Cliente> clientes = new ArrayList <>();

    
    public void registro(){
        System.out.print("\nIngresa el nombre - ");
            nombre=sc.nextLine();
        System.out.print("\nEdad - ");
            edad=sc.nextInt();
        System.out.print("\nFecha - ");
            fecha="02/10/2021";
        
        sc.nextLine();
        clientes.add(new Cliente(nombre,edad,fecha));
        System.out.print("\nIngresa el nombre - ");
            nombre=sc.nextLine();
        System.out.print("\nEdad - ");
            edad=sc.nextInt();
        System.out.print("\nFecha - ");
            fecha="11/02/2020";
        
        clientes.add(new Cliente(nombre,edad,fecha));
    }
    
    public void reservacion(){
       if(!reservar.containsKey(hab)){
          reservar.put(hab, nombre);
                                                    
       }else{
           System.out.println("Ya está ocupada la habitación");
       }
    
    }
    
    
    public void ver(){
        if(clientes.isEmpty()){
            System.out.println("Error");
        }else{
            for(int i=0;i<clientes.size();i++){
                System.out.println(clientes.get(i).getEdad());
                System.out.println(clientes.get(i).getFecha());
                System.out.println(clientes.get(i).getNombre());
            }
        }
    }
    
}
