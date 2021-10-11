package proyecto1;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Habitacion {

    // * * * * * * Creación de objeto de las biblioteca importadas * * * * * * 
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    Random rd = new Random();
    
    // * * * * * * Creación de objeto de la clase Fechas * * * * * * 
    Fechas fech = new Fechas();
    
    // * * * * * * Atributos de Cliente * * * * * *
    private int numeroH;
    private boolean disponible;
    private int clave;
    private String tipoHab;
    private String fechaInicial;
    private String fechaFinal;
    String inicial;
    String finall;
    String nmbrAlt;
    
    // * * * * * * Métodos constructores * * * * * * 
    public Habitacion(){}
   
    public Habitacion(int numeroH, boolean disponible, String tipoHab,String nmbrAlt, int clave){
        this.numeroH = numeroH;
        this.disponible = disponible;
        this.tipoHab = tipoHab;
        this.nmbrAlt=nmbrAlt;                                                
        this.clave = clave;
    }
    
    // * * * * * * Métodos de acceso * * * * * *     
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

    public void setNmbrAlt(String nmbrAlt) {
        this.nmbrAlt = nmbrAlt;
    }  
    
    // Método inicializar Habitación -> Inicializa la lista Habitación llenandola con Habitaciones aleatorias
    // Tiene como parámetro la lista creada en "Proyecto1"
    public void inicializarHab(List<Habitacion> listaHab){
        
        int numHab = 100, numHab2 = 200, numHab3 = 300, numHab4 = 400, numHab5 = 500;
        int numHab6 = 600, numHab7 = 700, numHab8 =800, numHab9 = 900, numHab10 = 1000;
        
        for(int i = 0; i<100; i++){
        
            boolean auxiliar = rd.nextBoolean();
            String names = nombresRandom(auxiliar,Nombres.nombresRandom()); 
            int clav = clavesRandom(auxiliar);
            
            
            if(i<=9){
                Habitacion nuevaHab = new Habitacion(numHab, auxiliar, "Sencilla",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab ++;
            }else if(i>9 && i<=19){
                Habitacion nuevaHab = new Habitacion(numHab2,auxiliar, "Sencilla",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab2 ++;            
            }else if(i>19 && i<=29){
                Habitacion nuevaHab = new Habitacion(numHab3,auxiliar, "Doble",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab3 ++;            
            }else if(i>29 && i<=39){
                Habitacion nuevaHab = new Habitacion(numHab4,auxiliar,"Doble",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab4 ++;            
            }else if(i>39 && i<=49){
                Habitacion nuevaHab = new Habitacion(numHab5,auxiliar,"Habitacion matrimonial",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab5 ++;            
            }else if(i>49 && i<=59){
                Habitacion nuevaHab = new Habitacion(numHab6,auxiliar,"Habitacion familiar",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab6 ++;            
            }else if(i>59 && i<=69){
                Habitacion nuevaHab = new Habitacion(numHab7,auxiliar,"Habitacion familar",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab7 ++;            
            }else if(i>69 && i<=79){
                Habitacion nuevaHab = new Habitacion(numHab8,auxiliar,"Habitacion compartida",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab8 ++;            
            }else if(i>79 && i<=89){
                Habitacion nuevaHab = new Habitacion(numHab9,auxiliar, "Suite Principal",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab9 ++;            
            }else if(i>89 && i<=99){
                Habitacion nuevaHab = new Habitacion(numHab10,auxiliar,"Pent House",names, clav);
                nuevaHab.fechaInicial = fechasAleatorias(auxiliar);
                nuevaHab.fechaFinal = fechasAleatorias2(auxiliar, nuevaHab.getFechaInicial());
                listaHab.add(i, nuevaHab);
                numHab10 ++;      
            }
        }
    }
    
    // Método claves Random -> Crea números aleatorios del 50 al 100 para almacenarlos en los objetos Habitación
    // como numero de clientes.
    // Tiene como parámetro la variable auxiliar booleana, la cual indica si la habitación esta disponible al
    // momento de generar habitaciones aleatorias
    public int clavesRandom(boolean auxiliar){
        if(!auxiliar){
            return rd.nextInt(100)+50;         
        }else{
            return 0;
        }
    } 
    
    // Método nombres Random -> Retorna el nombre aleatorio si la habitación esta ocupada
    // Tiene como parámetro la variable auxiliar booleana, la cual indica si la habitación esta disponible al
    // momento de generar habitaciones aleatorias y la variable la cual genera los nombre aleatorios
    public String nombresRandom(boolean auxiliar, String names ){       
        if(!auxiliar){
            return names;         
        }else{
            return "---";
        }
    }  
    
    // Método juntar -> Asocia el atributo numero de cliente con la clave de la tabla Hash
    // Tiene como parámetros la lista y la tabla Hash creada en "Proyecto1", 
    // además de el número de habitación, la clave y el nombre del objeto Habitación creada
    public void juntar(List<Habitacion> listaHab, Map<Integer,Cliente> reservar, int numHab, int clave,String nombre) throws ParseException{
        
        for(int i=0; i<listaHab.size(); i++){
            if(listaHab.get(i).getNumero() == numHab){
                System.out.print("Fecha inicio con formato dd/MM/yy: ");
                inicial = sc.nextLine();
                System.out.print("Fecha final con formato dd/MM/yy: ");
                finall = sc.nextLine();
                if(fech.diferencia(inicial, finall)<80){
                    listaHab.get(i).setFechaInicial(inicial);
                    listaHab.get(i).setFechaFinal(finall);  
                    listaHab.get(i).setDisponible(false);
                    listaHab.get(i).setClave(clave);
                    listaHab.get(i).setNmbrAlt(nombre);                    
                }else{
                    System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * * * * *");
                    System.out.println("\t\t\t* No te puedes quedar a vivir aquí (:   *");
                    System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * * * *");
                }


            }
        } 
    }
    
    // Método fechas Aleatorias -> Genera una fecha aleatoria inicial
    // Tiene como parámetro la variable auxiliar booleana, la cual indica si la habitación esta disponible al
    // momento de generar habitaciones aleatorias
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
    
    // Fechas Aleatorias 2 -> Genera una fecha aleatoria final, 40 días después de la fecha inicial
    // Tiene como parámetro la variable auxiliar booleana, la cual indica si la habitación esta disponible al
    // momento de generar habitaciones aleatorias y una fecha inicial dada
    public String fechasAleatorias2(boolean auxiliar, String fechaInicial){
        if(!auxiliar){
            return fech.sumarFechas(fechaInicial);
        }else{
            return "00/00/0000";
        }
    }
    
    // Imprimir Habitación -> Imprime los atributos de cada objeto Habitación
    public void imprimirHabitacion(){
        System.out.println("\nHabitacion: "+numeroH);
        if(disponible){
            System.out.println("Disponibilidad: Disponible");
        }else{
            System.out.println("Disponibilidad: Ocupada");
        }
        System.out.println("Nombre: "+nmbrAlt);
        System.out.println("Clave de cliente: "+clave);
        System.out.println("Fecha Inicial: "+fechaInicial);
        System.out.println("Fecha Final: "+fechaFinal);
    } 
    
    // Imprimir lista -> Imprime los atributos de cada objeto Habitación que existen en la lista
    // Tiene como parámetro la lista creada en la clase "Proyecto1"
    public void imprimirLista(List<Habitacion> listaHab){
        for(Habitacion hab: listaHab){
            hab.imprimirHabitacion();
        }
    }

    // Imprimir Disponible -> Imprime los atributos de cada objeto Habitación Disponibles que existen en la lista
    // Tiene como parámetro la lista creada en la clase "Proyecto1"
    public void imprimirDisponibles(List<Habitacion> listaHab){
        System.out.println("\n\t\tHabitaciones Disponibles");
        System.out.println("________________________");
        for(Habitacion hab: listaHab){
            if(hab.getDisponible()==true){
                hab.imprimirHabitacion();
                hab.getTipoHab();
                System.out.println("________________________");
            }
        }
    }
    
    // Imprimir Ocupadas -> Imprime los atributos de cada objeto Habitación Ocupadas que existen en la lista
    // Tiene como parámetro la lista creada en la clase "Proyecto1"
    public void imprimirOcupadas(List<Habitacion> listaHab){
        System.out.println("\n\t\tHabitaciones Ocupadas");
        System.out.println("________________________");
        for(Habitacion hab: listaHab){
            if(hab.getDisponible()==false){
                hab.imprimirHabitacion();
                hab.getTipoHab();
                System.out.println("________________________");
            }
        }
    }
    
    // Modificar Fechas -> Modifica la fecha de un objeto Habitación dado
    // Tiene como parámetros la lista y tabla Hash creada en la clase "Proyecto1"
    public void modificarFechas(List<Habitacion> listaHab, Map<Integer,Cliente> revervar){
        System.out.print("Ingresa tu número de cliente: ");
        int clave = sc.nextInt();
        if(seEncuentra(listaHab, clave)){
            for(int i=0; i<listaHab.size(); i++){
                if(listaHab.get(i).getClave() == clave){
                    System.out.println("\n  Modifica tus fechas:");
                    sc.nextLine();
                    System.out.print("Fecha inicio con formato dd/MM/yy: ");
                    inicial = sc.nextLine();
                    System.out.print("Fecha final con formato dd/MM/yy: ");
                    finall = sc.nextLine();
                    listaHab.get(i).setFechaInicial(inicial);
                    listaHab.get(i).setFechaFinal(finall);
                    
                    System.out.println("\n\t\t\t* * * * * * * * * * * * *");
                    System.out.println("\t\t\t* Fechas modificadas (: *");
                    System.out.println("\t\t\t* * * * * * * * * * * * *");
                }
            }             
        }else{
            System.out.println("\n\t\t\t* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("\t\t\t* No estas estas registrado,            *");
            System.out.println("\t\t\t* o no has hecho alguna reservación ):  *");
            System.out.println("\t\t\t* * * * * * * * * * * * * * * * * * * * *");
        }
    }
    
    // Se encuentra -> Busca en una lista si se encuentra el atributo "clave" de un objeto Habitación
    // Devuelve verdadero o falso, si la clave se encuentra en la lista Habitaciones
    // Tiene como parámetro la lista creada en la clase "Proyecto1" y la clave a buscar
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