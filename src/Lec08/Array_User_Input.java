package Lec08;

import java.util.Scanner;

public class Array_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// input ke liye
		int n=sc.nextInt();// yaha user input dega array ka size
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Display(arr);
		

	}
	public static void Display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
