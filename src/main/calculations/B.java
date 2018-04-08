package main.calculations;

import main.Input;

public class B extends Calculations{

    // Formula is 3a + b = n2 - n1

    A aTerm = new A();
    Input input = new Input();

    int n1 = input.getNumber1();
    int n2 = input.getNumber2();

    public int getb1() {
        return number2 - number1;
    }

    public int getb2() {
        return 3 * aTerm.getA();
    }

    public int getB() {
        return getb1() - getb2();
    }











}
