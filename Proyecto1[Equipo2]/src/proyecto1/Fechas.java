package proyecto1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
/*
    Programación Orientada a Objetos - Grupo 3

    Balderas Arias Amanda
    Carranza Ochoa José David
    Carrillo Cervantes Ivette Alejandra
*/
public class Fechas {
    
    // * * * * * * Creación de objeto de la biblioteca Scanner * * * * * * 
    Scanner sc = new Scanner(System.in);
    
    // Método diferencia -> realiza la diferencia entre dos fechas
    // Tiene como parámetro la fecha incial y la fecha final
    public int diferencia(String fecha1, String fecha2) throws ParseException{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            DateFormat form = new SimpleDateFormat("yyyy-MM-dd");

            Date date1 = formato.parse(fecha1);
            Date date2 = formato.parse(fecha2);

            LocalDate inicio = LocalDate.parse(form.format(date1));
            LocalDate fin = LocalDate.parse(form.format(date2));

            int diferencia = (int)(ChronoUnit.DAYS.between(inicio, fin));
            return diferencia;
    } 
    
    // Método sumar Fechas -> Tiene como parámetro una fecha incicial,
    // retorna una fecha final, la cual será 40 días después de la fecha inicial
    public String sumarFechas(String arr){
        DateTimeFormatter  formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(arr,formateador);
        return formateador.format(fecha.plusDays(40));
    }
}
