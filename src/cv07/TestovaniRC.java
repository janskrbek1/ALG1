/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv07;

import java.util.Scanner;
/**
 *
 * @author skrbj
 */
public class TestovaniRC {
    
    private static final Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadavej cela kladna cisla, ukonci nekladnym:");
        long cislo;
        while ((cislo = sc.nextLong()) > 0) {
            boolean jeRC = jePlatneRC(cislo);
            System.out.println("Zadane cislo " + (jeRC ? "je" : "neni") + " platne rodne cislo.");
        }
    }
    
    /**
     * 
     * @param cislo desetimistne cislo
     * @return vysledek testu
     */
    private static boolean jePlatneRC(long cislo) {
        if (!jeDesetimistne(cislo)) return false;
        boolean vysl = false;
        if ((cislo / 10) % 11 == cislo - (cislo / 10) * 10)
            vysl = true;
        if ((cislo / 10) % 11 == 10 && cislo - (cislo / 10) * 10 == 0)
            vysl = true;        // RC 1954–1985
        
        return vysl;
    }
    
    private static boolean jeDesetimistne(long cislo) {
        return (cislo < 10000000000L && cislo >= 1000000000L); 
    }
    
}
