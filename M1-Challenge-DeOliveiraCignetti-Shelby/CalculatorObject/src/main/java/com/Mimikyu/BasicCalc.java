package com.Mimikyu;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        double num1;
        double num2;
        char op;
        double ans;

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = scanObject.nextDouble();

        System.out.println("Please enter second number: ");
        num2 = scanObject.nextDouble();

        System.out.println("What Operation? ( + , - , * , / ) ");
        op= scanObject.next().charAt(0);

        switch (op){
            case '+': ans = num1 + num2;
                    break;
            case '-': ans = num1 - num2;
                    break;
            case '*': ans = num1 * num2;
                    break;
            case '/': ans = num1 / num2;
                    break;
        default: System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }

}
