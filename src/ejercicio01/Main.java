package ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        
        CalcularEdades acceso = new CalcularEdades();
        
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la edad de Juan: ");
        acceso.setEdjuan(lectura.nextDouble());

        System.out.print("LAS EDADES SON: ALBERTO: " + (int) acceso.calcularEdalber() +" JUAN: " +(int) acceso.getEdjuan() +" ANA: " +(int) acceso.calcularEdana()+ " MAMA: " +(int) acceso.calcularEdmama());
    
        lectura.close();
    }
}