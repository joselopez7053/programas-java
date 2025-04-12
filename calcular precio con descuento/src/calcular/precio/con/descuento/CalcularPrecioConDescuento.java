/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular.precio.con.descuento;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class CalcularPrecioConDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        double descuento = 0;
        
        if (precio > 100 && precio <= 200) {
            descuento = 0.10;
        } else if (precio > 200 && precio <= 500) {
            descuento = 0.20;
        } else if (precio > 500) {
            descuento = 0.25;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
    
}
