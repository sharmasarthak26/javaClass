package Sarthak;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Pali(n);
	}
	public static void Pali(int n) {
		int x=n;
		int sum=0;
		while(n!=0) {
			int rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
//		System.out.println(sum);
		if(x==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
