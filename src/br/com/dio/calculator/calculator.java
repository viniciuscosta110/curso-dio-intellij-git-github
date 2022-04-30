package br.com.dio.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;


        System.out.println("First value: ");
        a = scan.nextInt();

        System.out.println("Second value: ");
        b = scan.nextInt();

        int add = add(a, b);
        int sub = sub(a, b);
        int mult = mult(a, b);
        double div = div(a, b);

        System.out.println("Add: " + add);
        System.out.println("Sub: " + sub);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return 1.00*a / b;
    }

}
