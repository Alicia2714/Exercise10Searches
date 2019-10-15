package com.Exercise10Searches.app;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS_ARRAY=100;
		
		//Variable declaration
		int numberToFind = 0;
		int indexFound = 0;
		int infLimit = 0;
		int supLimit= ELEMENTS_ARRAY;
		int pivotal = supLimit-infLimit/2;
		int temp =0;
		
		//Array declaration
		int [] myarray = new int[ELEMENTS_ARRAY];
		
		
		Random randomnumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Array initialization 
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			myarray[i] = randomnumbers.nextInt();
			System.out.print(myarray[i] +", ");
		}
		
		//Order the array numbers with the bubble method
		/*
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			for(int j=0; j<ELEMENTS_ARRAY-1; j++) {
				if(myarray[i]>myarray[i+1]) {
					temp = myarray[j+1];
					myarray[j+1] = myarray[j];
					myarray[j] = temp;
				}
			}
		}
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print(myarray[i] +", ");
		}
		*/
		
		//Ask the user for a number to find
		do {
		System.out.print("Please, insert a number you'd like to find: ");
		numberToFind = input.nextInt();
		if (numberToFind < 0) {
			System.out.print("This number is invalid");
		}
		} while (numberToFind < 0);
		
		while(infLimit<=supLimit) {
			pivotal= infLimit + (supLimit-infLimit)/2;
			if(numberToFind==myarray[pivotal]){
				indexFound = pivotal;
				break;
			}
			
			else if (numberToFind>myarray[pivotal]) {
				infLimit = pivotal+1;
			}
			
			else if (numberToFind<myarray[pivotal]) {
				supLimit = pivotal-1;
			}
			
			if (indexFound != -1) {
				System.out.print("The element was found at the index: " +indexFound);
			}
			else{
				System.out.print("The element is not present in the array :(");
			}
		}
		
	}

}
