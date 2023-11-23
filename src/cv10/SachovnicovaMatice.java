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
public class SachovnicovaMatice {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadej pocet radku a pocet sloupcu:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Zadej velikost pole:");
        int pocet = sc.nextInt();
        int[][] matice = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i / pocet + j / pocet) % 2 == 0) {
                    matice[i][j] = 0;
                } else {
                    matice[i][j] = 1;
                }
            }
        }
        vypisMatice(matice);
    }

    private static void vypisMatice(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%d", mat[i][j]);
            }
            System.out.println();
        }
    }
}
