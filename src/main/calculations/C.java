package main.calculations;

import main.Input;

public class C extends Calculations {

    //Sub class for calculations.

    // The formula is a+b+c = n1

    Input input = new Input();
    A aTerm = new A();
    B bTerm = new B();

    private int getSum() {
        return aTerm.getA() + bTerm.getB();
    }

    public int getC() {
        return number1 - getSum();
    }


}
