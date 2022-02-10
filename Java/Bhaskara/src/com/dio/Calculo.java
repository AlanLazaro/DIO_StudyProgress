package com.dio;

public class Calculo {
    protected int a;
    protected int b;
    protected int c;

    public Calculo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int delta(){
        return (b*b) - (4*a*c);
    }
    public Double rdelta(){
        return Math.sqrt(delta());
    }


    public double x1(){
        double x1 = (-b + rdelta())/(2*a);
        return x1;

    }public double x2(){
        double x2 = (-b - rdelta())/(2*a);
        return x2;
    }
}
