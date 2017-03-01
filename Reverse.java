package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=0,i=0;
		int b[] = new int[100];
		while(n!=0){
			a=n%10;
			b[i]=a;
			i++;
			n=n/10;	
		}
		for(int j=0;j<i;j++){
			System.out.println(b[j]);
		}

	}

}
