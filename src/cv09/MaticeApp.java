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
public class MaticeApp {

    private static final Scanner sc = new Scanner (System.in);
    private static double[][] matA = null;
    private static double[][] matB = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean konecProgramu;
        do {
            vypisMenu();
            int volba = nactiVolbu();
            konecProgramu = obsluzVolbu(volba);
        } while(!konecProgramu);
    }

    private static void vypisMenu() {
        System.out.println("Hra hadani cisla");
        System.out.println("1. Nacti prvni matici");
        System.out.println("2. Nacti druhou matici");
        System.out.println("3. Vypis matice");
        System.out.println("4. Vzajemna vymena obou matic");
        System.out.println("5. Vypocitat a vypsat soucet obou matic");
        System.out.println("6. Vypocitat a vypsat soucin obou matic");
        System.out.println("0. Konec");
    }

    private static int nactiVolbu() {
        System.out.print("Zadej cislo volby: ");
        int volba = sc.nextInt();
        return volba;
    }

    private static boolean obsluzVolbu(int volba) {
        switch (volba) {
            case 0: return true;
            case 1: matA = nactiMatici(); break;
            case 2: matB = nactiMatici(); break;
            case 3: vypisObouMatic(); break;
            case 4: vymenaMatic(); break;
            case 5: vypocetSouctuMatic(); break;
            case 6: vypocetSoucinuMatic(); break;
            default: System.out.println("Neznama volba " + volba);
        }
        return false;
    }

    private static double[][] nactiMatici() {
        System.out.println();
        System.out.println("Nacteni matice");
        System.out.println("Zadej pocet radku a sloupcu");
        int pr = sc.nextInt();
        int ps = sc.nextInt();
        System.out.println("Zadej prvky matice po radcich");
        double[][] mat = new double[pr][ps];
        for (int i = 0; i < pr; i++) {
            for (int j = 0; j < ps; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        return mat;
    }

    private static void vypisMatice(double[][] mat, String titulek) {
        System.out.println();
        System.out.println(titulek);
        if (mat == null) {
            System.out.println("Matice neni zadana");
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%6.2f", mat[i][j]);
            }
            System.out.println();
        }
//        for (double[] v : mat) {
//            for (double x : v) {
//                System.out.format("%6.2f",x);
//            }
//        }
    }
    
    private static void vypisObouMatic() {
        System.out.println();
        vypisMatice(matA, "Matice A");
        vypisMatice(matB, "Matice B");
    }

    private static void vymenaMatic() {
        double[][] tmp;
        tmp = matA;
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void vypocetSouctuMatic() {
        double[][] matC = MatrixTools.soucetMatic(matA, matB);
        vypisMatice(matC, "A + B");
    }

    private static void vypocetSoucinuMatic() {
        double[][] matC = MatrixTools.soucinMatic(matA, matB);
        vypisMatice(matC, "A * B");
    }

 
    
}
