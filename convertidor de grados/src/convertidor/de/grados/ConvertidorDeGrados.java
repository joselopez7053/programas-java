/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor.de.grados;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class ConvertidorDeGrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

       
        System.out.println("¿A que unidad deseas convertir?");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Elige una opcion (1 o 2): ");
        int opcion = sc.nextInt();

       
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + kelvin);
                break;
            default:
                System.out.println("Opcion no valida.");
    }
    } 
}
