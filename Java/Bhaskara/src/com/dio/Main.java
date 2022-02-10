package com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculo de Bhaskara");
        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();

        Calculo calc = new Calculo(a,b,c);

        System.out.println("X1: " + calc.x1());
        System.out.println("X1: " + calc.x2());


    }
}
