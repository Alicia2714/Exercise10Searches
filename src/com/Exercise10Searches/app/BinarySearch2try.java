package com.Exercise10Searches.app;

import java.util.Scanner;
import java.util.Random;

public class BinarySearch2try {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		int temp = 0;
		int numberToFind = 0;
		int limitInf = 0;
		int limitSup = ELEMENTS_ARRAY;
		int pivotal = limitSup-limitInf/2;
		int indexFound = 0;
		
		//Array declaration
		int[] myArray = new int[ELEMENTS_ARRAY];
		
		//Objects declaration
		Random randomnumbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
		//Fill the array with random numbers
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			myArray[i] = randomnumbers.nextInt(ELEMENTS_ARRAY);
			System.out.print(myArray[i] + ", ");
		}
		
		System.out.print("\n");
		
		//Sort the array with the bubble method
		for (int i =0; i<ELEMENTS_ARRAY; i++) {
			for (int j=0; j<ELEMENTS_ARRAY - 1; j++) {
				if(myArray[j]>myArray[j+1]) {
					temp = myArray[j+1];
					myArray[j+1] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.print(myArray[i] + ", ");
		}
		
		//Ask the user for a number to search in the array
		do {
			System.out.println("\n Introduce the number you want to serch in the array: ");
			numberToFind = input.nextInt();
			if(numberToFind<0) {
			System.out.print("The number you introduced is invalid, please try again.");	
			}
		}while(numberToFind < 0);
		
		//Binary search
		while(limitInf<=limitSup){
			pivotal = limitInf + (limitSup-limitInf)/2;
			if(numberToFind==myArray[pivotal]) {
				indexFound = pivotal;
				break;
			}
			
			else if(numberToFind > myArray[pivotal]) {
				limitInf = pivotal+1;
			}
			
			else if(numberToFind < myArray[pivotal]) {
				limitSup = pivotal-1;
			}
			
		}
		
		if(indexFound != -1) {
			System.out.println("The number was found at the index: " +indexFound);
		}
		else {
			System.out.println("The number you were looking for doesn't exist in the array");
		}

	}

}
