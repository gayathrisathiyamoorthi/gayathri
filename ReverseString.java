package reverse;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		StringBuffer b=new StringBuffer(s);
		String c=b.reverse().toString();
		System.out.println(c);
	}

}
