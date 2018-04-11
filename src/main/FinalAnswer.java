package main;

import main.calculations.A;

import main.calculations.B;

import main.calculations.C;

public class FinalAnswer {

    // an²+bn+c

    // When a, b or c is equal to 1, it usually cancels out. I couldn't find a w

    A termA = new A();
    B termB = new B();
    C termC = new C();

    int a = termA.getA();
    int b = termB.getB();
    int c = termC.getC();

    public static void finalAnswer(int a, int b, int c) {

        /*
        -This will check if any values are 1 since its better to replace 1 with just 'n'.
        -This will also check if there is a minus so it can replace +- with just - .
        -This also checks both.

        If only I had more experience, I would've found a way to shorten down the lines.
        */

        String n = "n²"; // cba to copy and paste it everywhere


        if (a < 0) {
            System.out.println("Answer is: " + a + n + "+" + b + "n" + "+" + c);
        } else if (b < 0) {
            System.out.println("Answer is: " + a + n + b + "n" + "+" + c);
        } else if (c < 0) {
            System.out.println("Answer is: " + a + n + "+" + b + "n" + c);
        } else {
            System.out.println("Answer is: " + a + n + "+" + b + "n" + "+" + c);
        }


         /* You will still get a correct answer, but you will have to change it yourself so if it's a
        +- then obviously it should be -. Or if it's 1n then it should be n only. It's not mandatory, but it is best
        to do it like that. */


    }


}
