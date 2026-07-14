package Lec09;

public class Product_of_array_except_self_my_logic_leetcode {// complete on my own no video solution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4};
		int []leftproduct=new int[arr.length];
		int[]rightproduct=new int[arr.length];
		int[]product=new int [arr.length];
		leftproduct(arr,leftproduct);
		rightproduct(arr,rightproduct);
		product(product,leftproduct,rightproduct);
		for(int i=0;i<arr.length;i++) {
			System.out.println(product[i]+" ");
		}

	}
	public static void leftproduct(int[]arr,int[]leftproduct) {
		leftproduct[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			leftproduct[i]=leftproduct[i-1]*arr[i-1];
		}
	}
	public static void rightproduct(int[]arr,int[]rightproduct) {
		int n=arr.length;
		rightproduct[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			rightproduct[i]=rightproduct[i+1]*arr[i+1];
		}
		
	}
	public static void product(int[]product,int[]leftproduct,int[]rightproduct) {
		for(int i=0;i<leftproduct.length;i++) {
			product[i]=leftproduct[i]*rightproduct[i];
		}
	}
	

}
