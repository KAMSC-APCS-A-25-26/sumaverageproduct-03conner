/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // NAME                 :   Conner Chan
// GROUP                :   APCSA
// LAST MODIFIED        :   9/9/25
// PROBLEM ID           :   2.21 - 2.22
// PROBLEM DESCRIPTION  :   Have the user imput # numbers then output
//                      :   the average, difference, and the sum
// SOURCES USED         :   AP CS textbook
// PEOPLE I HELPED      :   Michael Xndzov
// I RECEIVED HELP FROM :   Michael Xendzov
        // declares varables
        double num1, num2, num3, num4, numruns;
        // prompt the uers for the number of runs
        Scanner scan = new Scanner(System.in);
        System.out.println("How many runs?");
        numruns = scan.nextDouble();
        num2 = 0;
        num3 = 1;
        for (int k = 0; k < numruns; k++) {
            System.out.println("Enter 1 number");
            num1 = scan.nextDouble();
            num2 = num1 + num2;
            num3 = num1 * num3;
        }
        num4 = num2 / numruns;
        // outputs the sum, product, and average
        System.out.println("The sum is " + num2);
        System.out.println("The product is " + num3);
        System.out.println("The average is " + num4);


    }
}


