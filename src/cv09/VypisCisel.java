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
        
        int pocMist = Math.max(pocetCifer(a),pocetCifer(b));
        String fmt = String.format("%%%dd", pocMist);
        
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % del == 0) {
                cnt++;
                if (cnt % pr == 0) {
                    System.out.format(fmt,i);
                    System.out.println();
                }
                else {
                    System.out.format(fmt,i);
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    
    private static int pocetCifer (int cislo) {
        String tmp = Integer.toString(cislo);
        return tmp.length();
    }
}
