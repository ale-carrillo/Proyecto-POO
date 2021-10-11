package proyecto1;

import java.util.Set;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Actividades {
    
    // * * * * * * Atributos de Cliente * * * * * *
    String nombre;
    String horario;
    String nombreInstructor;
    double costo;
    int limPersonas;
    
    // * * * * * * Métodos constructores * * * * * * 
    public Actividades(){

    }
    public Actividades(String nombre, String horario, String nombreInstructor, double costo, int limPersonas){
        this.nombre = nombre;
        this.horario = horario;
        this.nombreInstructor = nombreInstructor;
        this.costo = costo;
        this.limPersonas = limPersonas;
    }
    
    // * * * * * * Métodos de acceso * * * * * *
    public String getNombre(){
        return nombre;
    }
    public String getHorario(){
        return horario;
    }

    public String getNombreInstructor(){
        return nombreInstructor;
    }

    public double getCosto(){
        return costo;
    }

    public int getLimPersonas(){
        return limPersonas;
    }
    
    // Método actividades -> Crea tres objetos de tipo Actividades y las agrega al conjunto
    // Tiene como parámetro el conjunto creado en la clase "Proyecto1"
    public void actividades(Set<Actividades> conjunto){
        Actividades buceo = new Actividades("BUCEO","09:00 a.m. - 10:00 a.m.", "Amanda Balderas", 299.99, 15);
        Actividades surf = new Actividades("SURF","01:00 p.m. - 3:00 p.m", "David Carranza", 499.99, 10);
        Actividades paracaidismo = new Actividades("PARACAIDISMO","04:00 p.m. - 05:00 p.m.", "Alejandra Carrillo", 699.99, 2);
        
        conjunto.add(buceo);  
        conjunto.add(surf);
        conjunto.add(paracaidismo);
        imprimirActividades(conjunto);

    }

    // Método Imprimir Actividades -> Imprime los objetos que contiene el conjunto
    // Tiene como parámetro el conjunto creado en la clase "Proyecto1"
    public void imprimirActividades(Set<Actividades> conjunto){
        System.out.println("\n________________________\n");
        for(Actividades act: conjunto){
            System.out.println("\t"+act.getNombre());
            System.out.println("Horario: "+act.getHorario());
            System.out.println("Nombre del instructor: "+act.getNombreInstructor());
            System.out.println("Costo: $"+act.getCosto());
            System.out.println("Limite de personas: "+act.getLimPersonas());
            System.out.println("________________________\n");
        }
    }       
}