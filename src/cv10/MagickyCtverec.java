/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv10;

import java.util.Scanner;

/**
 *
 * @author skrbj
 */
public class MagickyCtverec {
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej velikost ctvercove matice");
        int n = sc.nextInt();
        System.out.println("Zadej prvky matice");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // test, zda obsahuje vsechny prvky 1, 2, 3 .. n*n
        boolean jsouVsechnaCisla = true;
        // 1
        for (int cislo = 1; cislo < n * n; cislo++) {
            boolean jeCislo = false;
            TEST_CISLA:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] == cislo) {
                        jeCislo = true;
                        break TEST_CISLA;
                    }
                }
            }
            if (!jeCislo) {
                jsouVsechnaCisla = false;
                break;
            }
        }
        // 2
        jsouVsechnaCisla = true;
        boolean[] vyskytCisla = new boolean[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0 && a[i][j] <= n*n) {
                    vyskytCisla[a[i][j] - 1] = true;
                }
            }
        }
        for (int i = 0; i < vyskytCisla.length; i++) {
            if (!vyskytCisla[i]) {
                jsouVsechnaCisla = false;
                break;
            }
        }
        
        // test, zda jsou vsechny soucty stejne
        boolean jsouStejneSoucty = true;
        int[] soucty = new int[n*n+2];
        for (int i = 0; i < n; i++) {
            soucty[0] += a[i][i];
            soucty[1] += a[n-i-1][n-i-1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soucty[i+2] += a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soucty[i+2+n] += a[j][i];
            }
        }
        for (int i = 1; i < soucty.length; i++) {
            if (soucty[i] != soucty[0]) {
                jsouStejneSoucty = false;
            }
        }
        System.out.println("Zadany ctverec " + (jsouVsechnaCisla && jsouStejneSoucty ? "je" : "neni") + " magicky.");
    }
    
}
