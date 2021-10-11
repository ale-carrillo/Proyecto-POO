package proyecto1;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Nombres {
    
    // Método Nombres Random -> Gernera un nombre aleatorio de los escritos a continuación
    // Retorna el nombre seleccionado
    public static String nombresRandom() {

        String[] nmbrRnd = { "Andrea", "David", "Antonio", "Juan", "María", "Guadalupe", "Tatiana", "Bartolo",
            "Porfirio ", "Baruc", "Francisco", "Candelaria", "Cándida", "Alejandra", "Caridad", "Carina", "Julia",
            "Caritina", "Carlota", "Amada ",//20
        
            "Nereida", "Lara ", "Antonio ", "Andrés ", "Hernán  ", "Maite ", "Edgar", "José ",
            "Bartolomé", "Antonia ", "Pascual ", "Rocío ", "Lorenza ", "Elías ", "Mónica ", "Alfonso ", "Javier ",
            "Narcisa ", "Carlos", "Gerónimo ","Pastor ","Bruno", "Clemente", "Teófilo ", //24
            
            "Ester ", "Liliana ", "Luis ", "Juan", "Luis ", "Fabio", "Daniel ", "Cristóbal",
            "Miguel ", "Adolfo ", "Lidia ", "Reina ", "Daniela ", "Lilia", "Fabricio ", "Celestina ", "Manuel",
            "Úrsula ", "Yolanda", "Jennifer",//20
            
            "Isaac ", "Máximo ", "Ricardo", "Fidel ", "Belén", "Flor", "Diana ", "Araceli",
            "Estela", "Nicolasa ", "Micaela ", "Edgar", "Salomón ", "Tatiana ", "Teresa", "Javier", "Ramiro",
            "Manolo", "Gloria", "Alfredo",//20
                
            "Pascuala", "Pepita", "Demetrio ", "Piedad ", "Aarón", "Flor", "Xavier ", "Leonel",
            "Felix ", "Severiano ", "Agustín", "Mauricio ", "Salomón ", "Ana", "Jimmy", "Rolando", "Osvaldo",
            "Mariana", "Jorge", "Pedro"//20
        };
        int i = (int) (Math.random()*(nmbrRnd.length));
        
        return nmbrRnd[i];
    }    
}