package base_to_decimal;

import java.util.Scanner;

/*
  You are given a number A. You are also given a base B. A is a number on base B.
  You are required to convert the number A into its corresponding value in decimal number system.
 */

public class Base_To_Decimal {

	private static void base_to_decimal(int number, int b) {

		int power=1;			
		int answer=0;
		while(number>0)
		{
			int remainder=number%10;		// last digit
			answer+=remainder*power;		// digit * power
			power=power*b;					// power * base
			number/=10;						// Reducing number
		}
		System.out.println(answer);
	}
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		base_to_decimal(A,B);
	}
}
/*
	Input
	A = 1010
	B = 2
	
	Output
	10
	
	Input
	A = 22 
	B = 3
	
	Output
	8
*/