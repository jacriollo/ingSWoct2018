/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular_edad;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Julio
 */
public class Calcular_edad {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calcular(new GregorianCalendar(1990,06,20))); 
    }
    public static int calcular(Calendar fechaNac){
        Calendar FechaActual=Calendar.getInstance(); 
        //calcular
        int anio =FechaActual.get(Calendar.YEAR)-fechaNac.get(Calendar.YEAR);
        int mes=FechaActual.get(Calendar.MONTH)-fechaNac.get(Calendar.MONTH);
        int dia=FechaActual.get(Calendar.DAY_OF_MONTH)-fechaNac.get(Calendar.DAY_OF_MONTH);
        
        if((mes<0)||(mes==0&&dia<0)){
            anio--;
        }        
        return anio;
    }
}
