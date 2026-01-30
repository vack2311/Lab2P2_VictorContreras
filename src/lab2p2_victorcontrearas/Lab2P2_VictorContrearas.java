    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_victorcontrearas;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_VictorContrearas {
public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        estacionamiento();
                
        
    }
    public static void menu(){
        System.out.println(" Ingresar carro ");
        System.out.println(" Marca de su carro: ");
        String tipo = leer.next(); 
        System.out.println(" Color de su carro: ");
        String color = leer.next();
        System.out.println(" Saldo a pagar: ");
        double saldo = leer.nextDouble();
        
        /*System.out.println("---Opciones---");
        System.out.println("1.Nuevo carro");
        System.out.println("2. Sacar carro del estacionamiento");
        System.out.println("3. Ver carros creados sin ingresar");
        System.out.println("5. Salir");*/
        
    }
    public static void estacionamiento(){
        System.out.println("Ingrese el tamaño del estacionamiento ");
        int n = leer.nextInt();
        if (n>3) {
            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(" - ");
                }
                
            }
            
            
        }
        
    }
}
