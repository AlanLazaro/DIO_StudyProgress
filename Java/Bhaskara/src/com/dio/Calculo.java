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
    public void bhaskara(){
        double delta = delta();
        if(delta > 0){
            if(a ==0 ){
                System.out.println("Equação de Primeiro Grau");
            }
            else {
                System.out.println(x1(delta));
                System.out.println(x2(delta));
            }
        }
        else if(delta < 0){
            System.out.println("Não existe resultado Possivel dentro do conjunto dos números Reais");
        }
        else{
            if(a ==0 && b ==0) {
                System.out.println("Equação Inexistente");
            }
            else{
                System.out.println(x1(delta));
            }

        }
    }

    public int delta(){
        return (b*b) - (4*a*c);
    }
    public Double rdelta(double delta){
        return Math.sqrt(delta);
    }

    public double x1(double delta){
        double x1 = (-b + rdelta(delta))/(2*a);
        return x1;
    }
    public double x2(double delta){
        double x2 = (-b - rdelta(delta))/(2*a);
        return x2;
    }
}
