package main;

import java.util.Scanner;

public class Input {

    static int n1;
    static int n2;
    static int n3;
    static int n4;

    int validation = 1;

    public void inputMain() {
        do {
            try {
                Scanner in1 = new Scanner(System.in);
                msg("1st");
                n1 = in1.nextInt();
                validation = 2;

                Scanner in2 = new Scanner(System.in);
                msg("2nd");
                n2 = in2.nextInt();
                validation = 2;

                Scanner in3 = new Scanner(System.in);
                msg("3rd");
                n3 = in3.nextInt();
                validation = 2;

                Scanner in4 = new Scanner(System.in);
                msg("4th");
                n4 = in4.nextInt();
                validation = 2;

            } catch (Exception e) {
                System.out.println("Please enter numbers ONLY..");
                validation = 1;
            }
        } while (validation == 1);

    }

    private static void msg(String x) {
        System.out.println("Please enter the " + x + " term: ");
    }

    public int getNumber1() {
        return n1;
    }

    public int getNumber2() {
        return n2;
    }

    public int getNumber3() {
        return n3;
    }

    public int getNumber4() {
        return n4;
    }


}
