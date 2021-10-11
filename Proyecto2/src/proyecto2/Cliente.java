/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author aleja
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String fecha;  

    public Cliente(){
    }
   
    public Cliente(String nombre,int edad,String fecha){
        this.nombre=nombre;
        this.edad=edad;
        this.fecha=fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<18 && edad>100){
            System.out.println("No puedes registrarte ):");
        }
        else{
            this.edad = edad;
        }
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
