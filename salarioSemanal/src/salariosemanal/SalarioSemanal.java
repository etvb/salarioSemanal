
package salariosemanal;

import java.util.Scanner;

public class SalarioSemanal {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
        int horasTrabajadas;
        final float salarioXHora = 55.80f;
        /*
        a la semana se trabajan 45 horas semanales
        */
        System.out.println("Ingresar las horas semanales trabajadas");
        horasTrabajadas = entrada.nextInt();
        
        System.out.println("Sueldo semanal = " + "$" + (horasTrabajadas * salarioXHora));
        
    }
    
}
