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
public class CifernySoucetSoucin {

    public static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long cislo;
        int cifernySoucet, cifernySoucin;
        byte cifra;
        
        System.out.println("Zadavej kladna cela cisla, pro ukonceni nacitani zadej nekladne:");
        while ((cislo = sc.nextLong()) > 0) {
            cifernySoucet = 0;
            cifernySoucin = 1;
            while (cislo > 0) {
                cifra = (byte) (cislo % 10);
                cifernySoucet += cifra;
                if (cifra > 0) cifernySoucin *= cifra;
                cislo /= 10;
            }
            System.out.format("Ciferny soucet = %d%nCiferny soucin nenulovych cifer = %d%n", cifernySoucet, cifernySoucin);
        }
    }
    
}
