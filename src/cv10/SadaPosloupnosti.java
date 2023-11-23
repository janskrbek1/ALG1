/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv10;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class SadaPosloupnosti {

    private static final Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // matipulace s posloupnostmi / vektory ruznych delek
        System.out.println("Zadej pocet posloupnosti");
        int pocet = sc.nextInt();
        int[][] posl;
        posl = new int[pocet][];
        for (int i = 0; i < pocet; i++) {
            System.out.println("Zadej pocet hodnot posloupnosti");
            int n = sc.nextInt();
            posl[i] = new int[n];
            for (int j = 0; j < n; j++) {
                posl[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(posl));
        // nactena vstupni data
        // dalsi zpracovani dle zadani
    }
    
}
