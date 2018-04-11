package main;

import main.calculations.A;
import main.calculations.B;
import main.calculations.C;
import main.calculations.Calculations;

public class FinalOperation {

    public int number1;
    public int number2;
    public int number3;
    public int number4;


    Input input = new Input();
    Calculations cal = new Calculations();

    A aTerm = new A();
    B bTerm = new B();
    C cTerm = new C();


    public int a = aTerm.getA();
    public int b = bTerm.getB();
    public int c = cTerm.getC();


    public void finaloperation() {

        input.inputMain();

        number1 = input.getNumber1();
        number2 = input.getNumber2();
        number3 = input.getNumber3();
        number4 = input.getNumber4();

        cal.assign(getN1(), getN2(), getN3(), getN4());
        int a = aTerm.getA();
        int b = bTerm.getB();
        int c = cTerm.getC();
        FinalAnswer.finalAnswer(a, b, c);
    }


    public int getN1() {
        return number1;
    }

    public int getN2() {
        return number2;
    }

    public int getN3() {
        return number3;
    }

    public int getN4() {
        return number4;
    }


}
