package com.gla.abstaction;

public class Main {
    public static void main(String[] args){
        Calculator calc = new SumClass();
        Calculator calc1 = new Subtract();
        System.out.println(calc1.cal(5,3));
        System.out.println(calc.cal(5,3));
    }
}
