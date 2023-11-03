/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv04;

import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class FaktorialCisla {

    private static final Scanner sc = new Scanner (System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadejte cele kladne cislo:");
        int maxn = sc.nextInt();
        int n = 1;
        for (int k = 1; k <= maxn; k++, n++) {
            long fakt = n;
            for (int i = 1; i < n; i++) fakt *= i;
            System.out.format("%d! = %d%n", n, fakt);
        }
    }
    
}
