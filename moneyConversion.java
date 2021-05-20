package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: Money conversion
 */

public class moneyConversion {
	
	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate=scanner.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 for vice versa: ");
		int convert=scanner.nextInt();
		
		if(convert==0) {
			
			System.out.println("Enter the dollar amount: ");
			double dollar=scanner.nextDouble();
			
			double toRMB=dollar*rate;
			
			System.out.println("$"+dollar+" is "+toRMB+" yuan");
		}
		else if(convert==1) {
			
			System.out.println("Enter the RMB amount: ");
			double yuan=scanner.nextDouble();
			
			double toDollar=yuan/rate;
			
			System.out.printf(yuan+" yuan is $%.2f",toDollar);	
		}
		else {
			System.out.println("Invalid number");
		}
		
	}
}
