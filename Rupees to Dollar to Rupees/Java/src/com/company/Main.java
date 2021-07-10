package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        while(true) {
            System.out.println("\n");
            System.out.println("----------Choose one of the following service----------\n");
            System.out.println("1.Rupee To Dollar Conversion.");
            System.out.println("2.Dollar To Rupee Conversion.");
            System.out.println("3.Exit");
            System.out.println("\n-------------------------------------------------------\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Option ");
            int no = sc.nextInt();
            System.out.print("\n");

            float rupee;
            float dollar;
            switch (no) {
                case 1:
                    System.out.println("Enter Rupee: ");
                    Scanner sc1 = new Scanner(System.in);
                    rupee = sc1.nextFloat();
                    dollar = rupee * 0.013f;
                    System.out.println("\nDollar: " + dollar);
                    break;
                case 2:
                    System.out.println("Enter Dollar: ");
                    Scanner sc2 = new Scanner(System.in);
                    dollar = sc2.nextFloat();
                    rupee = dollar * 74.54f;
                    System.out.println("\nRupee: " + rupee);
                    break;
                case 3:
                    System.exit(0);
            }

        }
    }
}
