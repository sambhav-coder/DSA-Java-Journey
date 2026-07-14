package Lec08;

import java.util.Scanner;

public class Arrays_Demo {
	public static void main(String[]args) {
		int [] arr=new int [5]; //creates array of size 5
		System.out.println(arr);// 1d array bnega uska adr ayega 
		System.out.println(arr[0]); // 0th index pe array ki value kyunki humne set nhi ki toh by default 0 lega
		System.out.println(arr[1]);//1st index pe value
		System.out.println(arr[4]);// 4th index pe value
		int []other=arr;// new array nhi bnna bas ek naya variable bna jo purane arrayv ko point kr rha mtlb 2 log ek cheez ko dekh rhe
		System.out.println(other.length);
	}

}
