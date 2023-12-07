/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv12;

/**
 *
 * @author skrbj
 */
public class StringTools {
    private StringTools() {        
    }
    
    public static boolean jePalindrom(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }
        return true;
    }
}
