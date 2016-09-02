package com.guvi.first;

import java.util.Scanner;

public class Palindome {

	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int n=scanner.nextInt();
	   int a=0,b=0,c=n;
	   while(n>0){
		   a=n%10;
		   n=n/10;
		   b=b*10+a;
	   }
	   if(b==c){
		   System.out.println("Palindrome");
	   }else{
		   System.out.println("not palindrome");
	   }

	}

}
