/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aleja
 */
public class Fechas {
    private String finicial;
    private String fechaFinal;
    Scanner sc = new Scanner(System.in);
    
	static public int Diferencia(String fecha1, String fecha2) throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
		DateFormat form = new SimpleDateFormat("yyyy-MM-dd");
	
		Date date1 = formato.parse(fecha1);
		Date date2 = formato.parse(fecha2);
		
		LocalDate inicio = LocalDate.parse(form.format(date1));
		LocalDate fin = LocalDate.parse(form.format(date2));
		
		int diferencia = (int)(ChronoUnit.DAYS.between(inicio, fin));
		return diferencia;
	}  
        
    	public int PedirFechas() throws ParseException{
		System.out.print("Fecha inicio con formato dd/MM/yy: ");
		finicial = sc.nextLine();
		System.out.print("Fecha final con formato dd/MM/yy: ");
		fechaFinal = sc.nextLine();
                int dif = Diferencia(finicial, fechaFinal);
                return dif;
	}
        
        public String sumarFechas(String arr){
            DateTimeFormatter  formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(arr,formateador);

            //System.out.println(formateador.format(fecha)); //Fecha original
            return formateador.format(fecha.plusDays(40));
        }
}
