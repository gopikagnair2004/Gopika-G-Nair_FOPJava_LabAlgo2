package com.labalgo2.currencyDenomination;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Inputing the values from user
		System.out.println("Enter the Size of Currency Denominations :");
		int sizeOfCurrencyDenomination = sc.nextInt();
		
		//Inputing the currency denominations
		int currencyDenominatons[] = new int[sizeOfCurrencyDenomination];
		System.out.println("Enter the Currency Denominations Value : ");
		for(int i=0;i<sizeOfCurrencyDenomination;i++) {
			currencyDenominatons[i] = sc.nextInt();
			//Checking if the denomination from user is 0.
			if(currencyDenominatons[i] == 0) {
				System.out.println("Please enter the denomination other than 0");
				i--;
			}
		}
		
		System.out.println("Enter the Amount you want to Pay");
		int amount=sc.nextInt();
		
		//Sorting the currency denominations using Merge Sort - Descending Order
		MergeSort sort = new MergeSort();
		sort.mergesort(currencyDenominatons,0,sizeOfCurrencyDenomination-1);
		
//		for(int x:currencyDenominatons)
//			System.out.println(x);
		
		//Calculating the denominations
		CurrencyDenominations denominations = new CurrencyDenominations();
		denominations.calculateNotes(amount,currencyDenominatons,sizeOfCurrencyDenomination);
		
		sc.close();

	}

}
