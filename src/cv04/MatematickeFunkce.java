/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alg1_cv04;

/**
 *
 * @author skrbj
 */
public class MatematickeFunkce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        double x = 5, y = 8, z, r, fi;

        x = Math.sin(Math.PI / 4);
        x = Math.cos(5);
        x = Math.tan(5);

        z = Math.toRadians(x);
        x = Math.toDegrees(z);

        r = Math.hypot(x, y);    // == Math.sqrt(x * x + y * y)
        fi = Math.atan2(y, x);

        x = Math.exp(r);
        y = Math.log(r);
        z = Math.log10(r);

        n = (int) (Math.random() * 100 + 1);

    }

}
