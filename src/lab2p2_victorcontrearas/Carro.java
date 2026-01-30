/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_victorcontrearas;

public class Carro {
    
String tipo;
    String color;
    double saldo;
    boolean pagado;
    int x, y;
    int id;

    Carro(String tipo, String color, double saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro(String tipo, String color, double saldo, boolean pagado, int x, int y, int id) {
        this.tipo = tipo;
        this.color = color;
        this.saldo = saldo;
        this.pagado = pagado;
        this.x = x;
        this.y = y;
        this.id = id;
    }
    public static boolean pagar(int saldo){
    if (saldo > 0) {
        System.out.println("Ya esta pagado el carro ");
        return true;
    }else{
        System.out.println("No ha pagado ");
        return false;
    }
}
public static char representacion(String tipo){
    char primerL = ' ';
    
    for (int i = 0; i < 1; i++) {
        primerL = tipo.charAt(i);
    }
    return primerL;
}
public static void cambiarCoordenadasCarro(int fila, int columna){
    
}
public static void retirarCarro(){
    
}
}
