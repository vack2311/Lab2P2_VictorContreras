    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_victorcontrearas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab2P2_VictorContrearas {
public static Scanner leer = new Scanner(System.in);
public static ArrayList<Carro> listaCarrosPorIngresar = new ArrayList<>();
public static Random random = new Random();
    public static void main(String[] args) {
        menu();
        
    }
    public static void menu(){
        int op = 0;
        do{
        estacionamiento();
        System.out.println("---Opciones---");
        System.out.println("1. Nuevo carro");
        System.out.println("2. Ingresar carro al estacionamiento");
        System.out.println("3. Sacar carro del estacionamiento");
        System.out.println("4. Ver carros creados sin ingresar");
        System.out.println("5. Salir");
        op = leer.nextInt();
        
        switch(op){
            case 1:
                nuevoCarro();
                break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                break;
           
            }
        }while(op != 6);
    }
    public static void nuevoCarro(){
            
        System.out.println(" Ingresar carro ");
        System.out.println(" Marca de su carro: ");
        String tipo = leer.next(); 
        System.out.println(" Color de su carro: ");
        String color = leer.next();
        System.out.println(" Saldo a pagar: ");
        double saldo = leer.nextDouble();
        
        Carro c = new Carro(tipo, color, saldo);
        int id = random.nextInt((100-20)+1)+20;
        
    }
    public static void estacionamiento(){
        System.out.println("Ingrese el tamaño del estacionamiento ");
        int n = leer.nextInt();
        int fila;
        int columna;
        if (n>3) {
            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(" - ");
                }    
            }         
        }else{
            System.out.println("Ingrese un numero mayor a 3");
            n = leer.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    System.out.print(" - ");
                }    
            }
            
        }
        System.out.println();
        
    }
}
