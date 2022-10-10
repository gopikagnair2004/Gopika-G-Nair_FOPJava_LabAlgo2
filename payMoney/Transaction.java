package com.labalgo2.payMoney;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Transaction Array : ");
		int noOfTransactions = sc.nextInt();
		if(noOfTransactions > 0)
		{
			System.out.println("Enter the Values of Array : ");
			int transactionArray[] = new int[noOfTransactions];
			for(int i=0;i<noOfTransactions;i++)
				transactionArray[i] = sc.nextInt();
			
			System.out.println("Enter the Total no of Targets that needs to be Achieved : ");
			int noOfTargets = sc.nextInt();
			
			while(noOfTargets > 0)
			{
				System.out.println("Enter the Value of Target : ");
				int target = sc.nextInt();
				int sumOfTansactions = 0;
				boolean targetAchieved = false;
				
				for(int i=0;i<noOfTransactions;i++)
				{
					sumOfTansactions = sumOfTansactions + transactionArray[i];
					if(sumOfTansactions >= target )
					{
						System.out.println("Target Achieved after "+(i+1)+" Transaction \n");
						targetAchieved = true;
						break;
					}
				}
				
				if(!targetAchieved)
					System.out.println("Given target is not achieved");
				noOfTargets--;
				
			}
		}
		else {
			System.out.println("Please enter transaction size gretaer than 0.");
		}
		
		

	}

}
