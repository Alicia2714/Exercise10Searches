package com.Exercise10Searches.app;

import java.util.Random;
import java.util.Scanner;

public class SecuentialSearchNonGreedy 
{

	public static void main(String[] args) 
	{
		
		//Constant declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		int numberToFind=0;
		int indexFound=-1;
		boolean onemore = false;
		boolean isFound=true;
		int index=0;
		
		//Array declaration
		int[] vector = new int[ELEMENTS_ARRAY];
		
		Random number= new Random(System.nanoTime());
		Scanner input= new Scanner(System.in);
		
		for (int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector[i]=number.nextInt(ELEMENTS_ARRAY);
			System.out.print(vector[i] + ", ");
		}
		
		
		do
		{
			System.out.println("\n Input the number you wish to search: ");
			numberToFind = input.nextInt();
			
			if(numberToFind<0) 
			{
				System.out.println("Input a number that is bigger than 0.");
			}
			
		}while(numberToFind<0);
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) 
		{
			if(numberToFind==vector[i]) {
				indexFound=i;
				break;
			}
			
		}
		
		if(indexFound != -1)
		{
			System.out.print("The number you were looking for is: "+indexFound);
		}
		else 
		{
			System.out.print("The number you were looking for doesn't exist in this array");
		}
		
		int i = 0;
		while(!isFound && i<ELEMENTS_ARRAY) 
		{
			if(numberToFind==vector[index]) {
				indexFound = index;
				isFound = true;
			}
			index++;
		}
		input.close();

	}

}
