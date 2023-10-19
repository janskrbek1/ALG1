/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alg_cv05;

import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class VypisyObrazcu {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Neplatny vstup!");
            return;
        }
        // radek
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        System.out.println();

        // ctverec
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // trojuhelnik 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // trojuhelnik 2
        for (int i = 1; i <= n; i++) {
            for (int k = n - 1; k > 0; k -= i) System.out.print(" ");              
            for (int j = 1; j <= i; j++) {
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}    
