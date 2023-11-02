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
public class PrestupnyRok {

    private static final Scanner sc = new Scanner (System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rok;
        System.out.println("Zadavej letopocty, ukonci nekladnym:");
        
        while ((rok = sc.nextInt()) > 0) {
            boolean jePrestupny = rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0);

            System.out.println("Rok " + rok + ((jePrestupny) ? (" je") : (" neni")) + " prestupny.");
        }
        
//        do {
//            System.out.println("Zadej letopocet:");
//            rok = sc.nextInt();
//            if (rok > 0) {
//                boolean jePrestupny = rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0);
//
//                System.out.println("Rok " + rok + ((jePrestupny) ? (" je") : (" neni")) + " prestupny.");
//            }
//        } while (rok > 0);
    }
    
}
