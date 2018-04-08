/*
-Author: Tarik Tekelioglu

-Program: Calculator for the nth term of any quadratic sequence.

-Purpose: I'm making this program to show the sixth form: ADA, my skills, to hopefully get accepted.

-This program will use the algebra method to solve the quadratic nth term.

*/


package main;

import java.util.Scanner;
import main.calculations.A;
import main.calculations.B;
import main.calculations.C;
import main.calculations.Calculations;

public class Main {


    public static void main(String[] args) {

        FinalOperation fo = new FinalOperation();
        B bTerm = new B();

        int validation = 1;
        int choice;

        String mainMsg = "-------------------------------------------------------------------------\n" +
                "Welcome to the quadratic nth term calculator by Tarik.\n " +
                "-------------------------------------------------------------------------\n\nplease choose an option:" +
                "\n\n\n\n1) Start calculator\n\n2) Info\n\n3) Exit";

        String infoMsg = "-Author: Tarik Tekelioglu\n" +
                "\n" +
                "-Program: Calculator for the nth term of any quadratic sequence.\n" +
                "\n" +
                "-Purpose: I'm making this program to show the sixth form: ADA, my skills, to hopefully get accepted.\n" +
                "\n" +
                "-This program will use the algebra method to solve the quadratic nth term." +
                "-If you get +0 in your answer, just cancel it out in real life." +
                "\n\n-If you get +- in your answer (although I fixed that), it's obviously a minus.\n\n\n\n\n1) Go back\n\n2) Exit";


        while (validation == 1) {
            Scanner in = new Scanner(System.in);
            System.out.println(mainMsg);
            choice = in.nextInt();

            if (choice == 1) {
                fo.finaloperation();
                validation = 2;
            }else if (choice == 2) {
                System.out.println(infoMsg);
                Scanner in2 = new Scanner(System.in);
                int c2 = in2.nextInt();
                if (c2 == 1) {
                    validation = 1;
                } else if (c2 == 2) {
                    System.out.println("Exiting..");
                    validation = 2;
                }
            }else if (choice == 3) {
                System.out.println("Exiting..");
                validation = 2;

            }


        }
    }
}