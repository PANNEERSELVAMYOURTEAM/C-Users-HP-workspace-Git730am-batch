package git.org;

import java.util.Scanner;



public class Fibonacciseries {



    
	public static void main(String[] args) {
		int n;
		 int a=0;
		int b=0;
		int c=1;

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value to print fibonacci series");
		n= sc.nextInt();
		System.out.println("the fibonacci series for the entered value is ");
	 for(int i=0;i<=n;i++){
		 a=b;
		 b=c;
		 c=a+b;
		 
		 System.out.println(a);
		 
		 
		 
		 
		 
		 
	 }
		
		
		
		
		
	}
	}
		       
	



