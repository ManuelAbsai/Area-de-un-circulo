/*Crea un programa para encontrar el área de un circulo, segun la siguiente     
        formula. Area=pi*R(2) */

package ejercicio1;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        double area;
        double radio; 
        final double PI = 3.1416;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del radio: ");
        double radioScan = sc.nextInt();

        radio= radioScan; 
        area = PI * (radio * radio); 
        System.out.println("El area es: " + area);
    
    }
}