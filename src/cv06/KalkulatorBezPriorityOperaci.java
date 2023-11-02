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
public class KalkulatorBezPriorityOperaci {

    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej matematicky vyraz:");
        
        double a;
        char op;
        
        double vysledek = sc.nextDouble();        
        
        while ((op = sc.next().charAt(0)) != '=') {
            a = sc.nextDouble();
            switch (op) {
                case '+' -> vysledek += a;
                case '*' -> vysledek *= a;
                case '-' -> vysledek -= a;
                case '/' -> vysledek /= a;
                default -> vysledek = Double.NaN;
            }
        }
        
        System.out.println("Vysledek: " + vysledek);
    }
    
}
