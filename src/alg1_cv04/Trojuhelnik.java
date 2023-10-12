/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alg1_cv04;

/**
 *
 * @author skrbj
 */
import java.util.Scanner;

public class Trojuhelnik {

    private static final Scanner sc = new Scanner (System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej delky stran trojuhelnika:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        
        if (x + y == z || x + z == y || y + z == x) {
            System.out.println("Nelze sestrojit trojuhelnik.");
        }
    }
    
}
