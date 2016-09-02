package com.guvi.first;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=0,b=0;
		while(n>0){
			a=n%10;
			n=n/10;
			b=b*10+a;
		}
		System.out.println(b);

	}

}
