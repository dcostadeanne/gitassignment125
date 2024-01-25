package demo;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,sum=0;
		
	System.out.println("Enter First number:");
	a=scan.nextInt();
	System.out.println("Enter second number:");
	b=scan.nextInt();
	
	sum=a+b;
	System.out.println("Sum is:"+sum);
				

}
}

