package com.guvi.first;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   int n=scanner.nextInt();
	   int a=n,b=0,c=0,d=0;
	   while(n>0){
		   b=n%10;
		   c=b*b*b;
		   d=d+c;
		   n=n/10;
	   }
	   if(a==d){
		   System.out.println("armstrong number");
	   }else{
		   System.out.println("not armstrong number");
	   }

	}

}
