package com.company;

import java.util.Scanner;

public class Main {

    public static Boolean answer(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Would you like to continue? 'Stop' to stop, 'Yes' to continue");
        String ans = scan1.next();
        if (ans.equals("Stop")){
            return true;

        }
        else if (ans.equals("Yes")){
            return false;
        }
        else {
            return answer();

        }
    }

    public static void calc(){
        Boolean stop = false;
        while(!stop) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please, insert 1st number:");
            double first = scan.nextDouble();
            System.out.println("Please, insert 2nd number:");
            double second = scan.nextDouble();
            System.out.println("Please, insert operation:");
            char op;
            String pt = scan.next();
            op = pt.charAt(0);
            switch (op) {
                case '+':
                    System.out.println("Result is " + (first + second));
                    break;
                case '-':
                    System.out.println("Result is " + (first - second));
                    break;
                case '*':
                    System.out.println("Result is " + (first * second));
                    break;
                case '/':
                    System.out.println("Result is " + (first / second));
                    break;


            }
            stop = answer();


        }
    }
    public static void main(String[] args) {
        // write your code here

        calc();
    }


}
