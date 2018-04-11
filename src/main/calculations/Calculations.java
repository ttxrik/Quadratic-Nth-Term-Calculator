
package main.calculations;

import main.FinalOperation;
import main.Input;

public class Calculations {

    /*To work out a, you find the difference between the 4 terms, then find the second difference.
     * Once you've done that, you half that number and that will give you the A value. */

    /*To work out b, the formula is 3a + b = n2-n1 */

    /*To work out c, the formula is a + b + c = n1*/


    public static int number1;
    public static int number2;
    public static int number3;
    public static int number4;

    public static int a;
    public static int b;
    public static int c;

    static A termA = new A();
    static B termB = new B();
    static C termC = new C();

    public void assign(int x, int y, int p, int q) {
        number1 = x;
        number2 = y;
        number3 = p;
        number4 = q;
    }


}
