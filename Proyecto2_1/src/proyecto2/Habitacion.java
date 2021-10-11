/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Habitacion {
//    List<Habitacion> listaHab = new ArrayList<Habitacion>();
    private int numeroH;
    private boolean disponible;
    private int clave;
    private String tipoHab;
    private String fechaInicial;
    private String fechaFinal;
    String inicial;
    String finall;
    Fechas fech = new Fechas();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    
    Random rd = new Random();
    //private int reservar;
    public Habitacion(){}
   
    public Habitacion(int numeroH, boolean disponible, String tipoHab){
        this.numeroH = numeroH;
        this.disponible = disponible;
        this.tipoHab = tipoHab;
    }
   
    public int getNumero(){
        return numeroH;
    }
    
    public boolean getDisponible(){
        return disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public String getTipoHab(){
        System.out.println("Tipo de habitación: "+tipoHab);
        return tipoHab;
    }
    
    public void setTipoHab(String tipoHab){
        this.tipoHab = tipoHab;
    }

    public String getFechaInicial(){
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial){
        this.fechaInicial = fechaInicial;
    }
    
    public String getFechaFinal(){
        return fechaFinal;
    }
    
    public void setFechaFinal(String fechaFinal){
        this.fechaFinal = fechaFinal;
    }
    
    public int getClave(){
        return clave;
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
    
    public void inicializarHab(List<Habitacion> listaHab){
        int numHab = 100, numHab2 = 200, numHab3 = 300, numHab4 = 400, numHab5 = 500;
        int numHab6 = 600, numHab7 = 700, numHab8 =800, numHab9 = 900, numHab10 = 1000;
        for(int i = 0; i<100; i++){
            boolean auxiliar = rd.nextBoolean();
            if(i<=9){
                Habitacion nuevaHab = new Habitacion(numHab, auxiliar, "Sencilla");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab ++;
            }else if(i>9 && i<=19){
                Habitacion nuevaHab = new Habitacion(numHab2,auxiliar, "Sencilla");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab2 ++;            
            }else if(i>19 && i<=29){
                Habitacion nuevaHab = new Habitacion(numHab3,auxiliar, "Doble");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab3 ++;            
            }else if(i>29 && i<=39){
                Habitacion nuevaHab = new Habitacion(numHab4,auxiliar,"Doble");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab4 ++;            
            }else if(i>39 && i<=49){
                Habitacion nuevaHab = new Habitacion(numHab5,auxiliar,"Habitacion matrimonial");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab5 ++;            
            }else if(i>49 && i<=59){
                Habitacion nuevaHab = new Habitacion(numHab6,auxiliar,"Habitacion familiar");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab6 ++;            
            }else if(i>59 && i<=69){
                Habitacion nuevaHab = new Habitacion(numHab7,auxiliar,"Habitacion familar");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab7 ++;            
            }else if(i>69 && i<=79){
                Habitacion nuevaHab = new Habitacion(numHab8,auxiliar,"Habitacion compartida");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab8 ++;            
            }else if(i>79 && i<=89){
                Habitacion nuevaHab = new Habitacion(numHab9,auxiliar, "Suite Principal");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab9 ++;            
            }else if(i>89 && i<=99){
                Habitacion nuevaHab = new Habitacion(numHab10,auxiliar,"Pent House");
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab10 ++;            
            }
        }
    }
    
    public void juntar(List<Habitacion> listaHab, Map<Integer,Cliente> reservar, int numHab, int clave){
        
        for(int i=0; i<listaHab.size(); i++){
            if(listaHab.get(i).getNumero() == numHab){
                System.out.print("Fecha inicio con formato dd/MM/yy: ");
                inicial = sc.nextLine();
                System.out.print("Fecha final con formato dd/MM/yy: ");
                finall = sc.nextLine();
                listaHab.get(i).setFechaInicial(inicial);
                listaHab.get(i).setFechaFinal(finall);
                listaHab.get(i).setDisponible(false);
                System.out.println(clave);
                listaHab.get(i).setClave(clave);
            }
        } 

    }
            
    public String fechasAleatorias(boolean auxiliar){
        
        if(!auxiliar){
            int ramDias = rd.nextInt(30)+1;
            int ramMes = rd.nextInt(12)+1;
            int ramAnio = 2021;
            String diaS = String.valueOf(ramDias);
            String mesS = String.valueOf(ramMes);
            String anioS = String.valueOf(ramAnio);
            if(ramMes<10 && ramDias<10){
                return "0"+diaS+"/0"+mesS+"/"+anioS;
            }else if(ramMes<10){
                return diaS+"/0"+mesS+"/"+anioS;
            }else if(ramDias<10){
                return "0"+diaS+"/"+mesS+"/"+anioS;
            }else{
                return diaS+"/"+mesS+"/"+anioS;                
            }
           
        }else{
            return "00/00/0000";
        }
    }
    
    public String fechasAleatorias2(boolean auxiliar, String fechaInicial){
        if(!auxiliar){
            return fech.sumarFechas(fechaInicial);
        }else{
            return "00/00/0000";
        }
    }
    
    public void imprimirHabitacion(){
        System.out.println("\nHabitacion: "+numeroH);
        if(disponible){
            System.out.println("Disponibilidad: Disponible");
        }else{
            System.out.println("Disponibilidad: Ocupada");
        }
        System.out.println("Clave de cliente: "+clave);
        System.out.println("Fecha Inicial: "+fechaInicial);
        System.out.println("Fecha Final: "+fechaFinal);
    } 
    
    public void imprimirLista(List<Habitacion> listaHab){
        for(Habitacion hab: listaHab){
            hab.imprimirHabitacion();
        }
    }

    public void imprimirDisponibles(List<Habitacion> listaHab){
        for(Habitacion hab: listaHab){
            if(hab.getDisponible()==true){
                hab.imprimirHabitacion();
                hab.getTipoHab();
                System.out.println("________________________");
            }
        }
    }
    
    public void imprimirOcupadas(List<Habitacion> listaHab){
        for(Habitacion hab: listaHab){
            if(hab.getDisponible()==false){
                hab.imprimirHabitacion();
                hab.getTipoHab();
                System.out.println("________________________");
            }
        }
    }
    
    public void modificarFechas(List<Habitacion> listaHab, Map<Integer,Cliente> revervar){
        System.out.println("Ingresa tu número de cliente: ");
        int clave = sc.nextInt();
        if(seEncuentra(listaHab, clave)){
            for(int i=0; i<listaHab.size(); i++){
                if(listaHab.get(i).getClave() == clave){
                    System.out.println("Modifica tus fechas:");
                    sc.nextLine();
                    System.out.print("Fecha inicio con formato dd/MM/yy: ");
                    inicial = sc.nextLine();
                    System.out.print("Fecha final con formato dd/MM/yy: ");
                    finall = sc.nextLine();
                    listaHab.get(i).setFechaInicial(inicial);
                    listaHab.get(i).setFechaFinal(finall);
                }
            }             
        }else{
            System.out.println("No estas registrado ):");
        }


    }
    public boolean seEncuentra(List<Habitacion> listaHab, int clave){
        boolean auxiliar = false;
                for(Habitacion habb: listaHab){
                    int claveGet = habb.getClave();
                    if(claveGet == clave){
                        auxiliar = true;
                        return auxiliar;
                    }
                }
            return auxiliar;
    }    
}