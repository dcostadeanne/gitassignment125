package demo;

import java.util.Scanner;

public class sub {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,sub=0;
		
	System.out.println("Enter First number:");
	a=scan.nextInt();
	System.out.println("Enter second number:");
	b=scan.nextInt();
	
	sub=a-b;
	System.out.println("difference is:"+sub);
				

}
}

