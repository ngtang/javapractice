package com.yourjava.basic;

public class Array1d {

    public static int a[] = { 1, 2, 3, 4, 5, 6, 7 }; // { -5, 2, -6, 8, 3, 9, 1, 4 };
    public static int len = a.length;

    public static void main(String[] agrs) {
        Array1d array1d= new Array1d();
        array1d.printAny("Hello world");
    }

    public void printAny(String text){
        System.out.println(text);
    }

}



// Array vs ArrayList