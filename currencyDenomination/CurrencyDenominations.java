package com.labalgo2.currencyDenomination;

public class CurrencyDenominations {
public void calculateNotes(int amount,int[] currencyDenominatons,int sizeOfCurrencyDenomination) {
	
	// Checking if the amount to be payed is 0
	if(amount == 0)
	{
		System.out.println("No payment approach as the amount to pay is : "+amount);
	}
	else {
	
		// Implementing the payment approach
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for( int i = 0; i < sizeOfCurrencyDenomination; i++ ) {
			int noOfNotes = (int) ( amount / currencyDenominatons[i] );
			if (noOfNotes != 0) 
				System.out.println( currencyDenominatons[i] + " : " + noOfNotes );
			amount = amount - ( noOfNotes * currencyDenominatons[i] );
		}
		
		//Checking if denominations doesnt suffice for the amount to be payed
		if(amount != 0 ) {
			System.out.println( "Not possible to pay for the rest of the amount : " + amount);
			
		}
	}
		
		  
	}
}

