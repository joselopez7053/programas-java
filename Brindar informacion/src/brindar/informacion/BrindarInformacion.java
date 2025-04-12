/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brindar.informacion;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class BrindarInformacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de uno de los siguientes:");
        System.out.println("Bad Bunny, Spiderman, Stranger Things, Mario Bros, Messi");
        System.out.print("Tu eleccion: ");
        String eleccion = sc.nextLine();

        switch (eleccion.toLowerCase()) {
            case "bad bunny":
                System.out.println("Bad Bunny es un cantante de regueton y trap latino de Puerto Rico.");
                break;
            case "spiderman":
                System.out.println("Spiderman es un superheroe de Marvel que fue mordido por una araña radiactiva.");
                break;
            case "stranger things":
                System.out.println("Stranger Things es una serie de Netflix que mezcla ciencia ficcion y suspenso.");
                break;
            case "mario bros":
                System.out.println("Mario Bros es un videojuego clasico de Nintendo protagonizado por un fontanero.");
                break;
            case "messi":
                System.out.println("Messi es un futbolista argentino considerado uno de los mejores del mundo.");
                break;
            default:
                System.out.println("No tengo informacion sobre eso.");
        }
    }
    
}
