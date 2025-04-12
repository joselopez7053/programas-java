/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.calificaciones.finales;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class CalculadoraDeCalificacionesFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parciales, proyecto, examen, calificacionFinal;

       
        System.out.print("Ingresa la calificacion de los parciales (0 a 100): ");
        parciales = scanner.nextDouble();

        System.out.print("Ingresa la calificacion del proyecto (0 a 100): ");
        proyecto = scanner.nextDouble();

        System.out.print("Ingresa la calificacion del examen final (0 a 100): ");
        examen = scanner.nextDouble();

       
        if (parciales < 0 || parciales > 100 || 
            proyecto < 0 || proyecto > 100 || 
            examen < 0 || examen > 100) {
            System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");
        } else {
            calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examen * 0.3);

            System.out.println("La calificacion final es: " + calificacionFinal);
        }

        scanner.close();
    }
    
}
