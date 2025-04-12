/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion.de.calificaciones;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class EvaluacionDeCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu calificacion: ");
        int calificacion = sc.nextInt();
        
        if (calificacion >= 90) {
            System.out.println("Tu calificacion es: A");
        } else if (calificacion >= 80) {
            System.out.println("Tu calificacion es: B");
        } else if (calificacion >= 70) {
            System.out.println("Tu calificacion es: C");
        } else if (calificacion >= 60) {
            System.out.println("Tu calificacion es: D");
        } else {
            System.out.println("Tu calificacion es: F");
        }
    }
    
}
