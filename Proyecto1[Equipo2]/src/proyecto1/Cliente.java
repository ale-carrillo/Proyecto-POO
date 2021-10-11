package proyecto1;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Cliente {
    
    // * * * * * * Atributos de Cliente * * * * * *
    private String nombre;
    private int edad;

    // * * * * * * Métodos constructores * * * * * * 
    public Cliente(){}
   
    public Cliente(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    // * * * * * * Métodos de acceso * * * * * *
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
            this.edad = edad;
    }
    
}
