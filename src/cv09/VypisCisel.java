/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv09;

import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class VypisCisel {

    private static final Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej dolni a horni mez");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Zadej delitele");
        int del = sc.nextInt();
        System.out.println("Zadej pocet cisel na radce");
        int pr = sc.nextInt();
        
        int j = 0;
        for (int i = a; i <= b; i++) {
            if (i % del == 0) {
                j++;
                if (j % pr == 0) System.out.println(i);
                else System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
