package Lec07_Functions;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// game between Aayush and Harshit the one who buys
		// more smartphone wins. If A buys 1phone then H buys 2 phone
		// if A buy 3 phone then H buy 4 phone and so on
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		
			int m=sc.nextInt();// for Aayush max limit for phone
			int n=sc.nextInt();// for Harshit........
			Shopping(n,m);
			t--;
		}
	}
	public static void Shopping(int n, int m) {
		int phone=1;
		int a=0;
		int h=0;
		while(true) {
			a=a+phone;
			if(a>m) {
				System.out.println("Harshit");
				break;
			}
			phone ++;
			h=h+phone;
			if(h>n) {
				System.out.println("Aayush");
				break;
			}
			
		}
	}

}
