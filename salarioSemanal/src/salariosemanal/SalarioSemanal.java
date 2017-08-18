/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariosemanal;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class SalarioSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
        int horasTrabajadas;
        final float salarioXHora = 55.80f;
        float salarioDiario;
        /*
        a la semana se trabajan 45 horas semanales
        */
        System.out.println("Ingresar las horas semanales trabajadas");
        horasTrabajadas = entrada.nextInt();
        
        System.out.println("Sueldo semanal = " + "$" + (horasTrabajadas * salarioXHora));
        
    }
    
}
