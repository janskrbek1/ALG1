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
public class ZakladniPrimitiva {
    
    private static final Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // uloha 1
        System.out.println("Zadavej cisla, ukonci nekladnym:");
        int cislo1, soucet = 0, pocet = 0;
        double prumer;
        while ((cislo1 = sc.nextInt()) > 0) {
            soucet += cislo1;
            pocet++;
        }
        prumer = (double) soucet / pocet;
        System.out.format("Soucet posloupnosti: %d, prumer posloupnosti: %f%n", soucet, prumer);
        
        // uloha 2
        System.out.println("Zadej pocet cisel:");
        pocet = sc.nextInt();
        System.out.println("Zadavej " + pocet + " cisel:");
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.MAX_VALUE;
        double cislo2;
        for (int i = 0; i < pocet; i++) {
            cislo2 = sc.nextDouble();
            if (cislo2 > max) max = cislo2;
            if (cislo2 < min) min = cislo2;
        }
        System.out.format("Minimum posloupnosti: %f, maximum posloupnosti: %f%n", min, max);
        
        // uloha 3
        boolean vzestupna = true;
        double tmp = Double.NEGATIVE_INFINITY;
        System.out.println("Zadej pocet cisel:");
        pocet = sc.nextInt();
        System.out.println("Zadavej " + pocet + " cisel:");
        for (int i = 0; i < pocet; i++) {
            cislo2 = sc.nextDouble();
            if (cislo2 <= tmp) {
                vzestupna = false;
            }
            tmp = cislo2;
        }
        System.out.println("Zadana posloupnost " + (vzestupna ? "je" : "neni") + " vzestupna.");
    }
    
}
