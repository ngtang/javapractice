package com.yourjava.basic;

public class NumberPractice {
    static int number=0;
    String text="supper";

    public void printAny(String text) {
        System.out.println(text);
        System.out.println(this.number);
    }

}

class A extends NumberPractice{
    String text="child";
    A(){
        System.out.println(super.text);
    }
    public static void main(String[] agrs) {
        A test= new A();
    }
}