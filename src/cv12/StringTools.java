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
    
    public static boolean jePalindrom(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
    
    private static char[] cifry = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    public static long prevodDoDesitkove(String cislo, byte zaklad) {
        
    }
    
    public static String prevodZDesitkove(long cislo, byte zaklad) {
        
    }
    
    /**
     * Sifrovani textu, sifrovat pouze pismena anglicke abecedy
     * @param text Sifrovany text
     * @param heslo Textovy retezec obsahujici pouze pismena anglicke abecedy
     * @return 
     */
    public static String sifruj(String text, String heslo){
        
    }
    
    public static String desifruj(String text, String heslo){
        
    }
}
