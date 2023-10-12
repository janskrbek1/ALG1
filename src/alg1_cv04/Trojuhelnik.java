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
        
        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Byla zadana zaporna cisla.");
            return;
        }
        
        if (x + y <= z || Math.abs(x - y) >= z) {
            System.out.println("Nelze sestrojit trojuhelnik.");
            return;
        }
        
        // vypocet plochy a obvodu
        double o = x + y + z;
        // double s = (x * vx) / 2;
        
        // priradit delky do promennych a, b, c tak, aby a <= b <= c
        
        
        // urcit typ dle delek stran – rovnostranny, rovnoramenny, obecny
        
        // urcit typ dle uhlu – pravouhly, tupouhly, ostrouhly (lze pomoci Pythagorovy vety)
        
        
    }
    
}
