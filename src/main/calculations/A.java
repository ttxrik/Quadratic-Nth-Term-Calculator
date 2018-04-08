
package main.calculations;

public class A extends Calculations {

    //Sub class for calculations.

    public int getDiifference1() { // The reason these methods are public is because I was testing one by one.
        return number2 - number1;
    }

    public int getDifference2() {
        return number3 - number2;
    }

    public int getMaindifference() {
        return getDifference2() - getDiifference1();
    }


    public int getA() {
        return getMaindifference() / 2;
    }

    public void test() {
        System.out.println(getDifference2());
    }


}
