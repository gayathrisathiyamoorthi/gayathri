package com.guvi.first;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	boolean flag=false;
	for(int i=2;i<n/2;i++){
		if(n%i==0){
			flag=true;
		}
	}
	if(flag==false){
		System.out.println("prime");
	}else{
		System.out.println("not prime");
	}

	}

}
