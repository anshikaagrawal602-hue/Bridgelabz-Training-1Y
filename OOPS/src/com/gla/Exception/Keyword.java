package com.gla.Exception;

public class Throw {
    static void ageChecker(int age){
        if(age<18){
            throw  new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        ageChecker(10);
        System.out.println();
    }
}
