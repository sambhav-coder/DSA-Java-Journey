package Lec07_Functions;

import java.util.Scanner;

public class is_Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Count_of_Digit(n);
		System.out.println(check_Armstrong(n));
		
	}
	
	public static int Count_of_Digit(int n) {
		int count=0;
		while(n>0) {
			
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static boolean check_Armstrong(int n) {
		int c=Count_of_Digit(n);
		int sum=0;
		int N=n;
		while(n>0) {
			int rem=n%10;
			int x=(int)(Math.pow(rem, c));
			sum=sum+x;
			n=n/10;
			
		}
		if(sum==N) {
			return true;
		}
		else {
			return false;
			
		}
	}

}
