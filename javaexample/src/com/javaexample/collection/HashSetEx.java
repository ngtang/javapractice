package com.javaexample.collection;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx {
 private HashSet<Integer> numbers = new HashSet<Integer>();
 public void create()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Input size of HashSet: ");
	 int size = Integer.parseInt(sc.nextLine());
	 for(int i=0;i<size;i++)
	 {
		 System.out.print("Input number "+(i+1)+" : ");
		 int number = Integer.parseInt(sc.nextLine());
		 numbers.add(number);
	 }
			 
 }
 @Override
 public String toString()
 {
	 String toStr="HashSet: ";
	 for(int i: this.numbers)
	 {
		 toStr+=i+" ";
	 }
	return toStr;
 }
}
