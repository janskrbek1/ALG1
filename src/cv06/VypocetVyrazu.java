/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv06;

import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class VypocetVyrazu {

    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej aritmeticky vyraz:");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        
        double vysledek;
        
        switch (op) {
            case '+' -> vysledek = a + b;
            case '*' -> vysledek = a * b;
            case '-' -> vysledek = a - b;
            case '/' -> vysledek = a / b;
            default -> vysledek = Double.NaN;
        }
        
        System.out.println("Vysledek: " + vysledek);
    }
    
}
