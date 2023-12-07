/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv12;

import java.util.Scanner;
/**
 *
 * @author skrbj
 */
public class StringTest {

    private static final Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        while((text = sc.nextLine()).length() > 0) {
            System.out.println(StringTools.jePalindrom(text));
        }
    }
    
}
