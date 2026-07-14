package Lec08;

public class Array_Swap_Demo1 {// is method se swap nhi hoga

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr= {};// array bnaya but  size define nhi kiya size=0
		int []arr= {10,4,5,67,8};// define array with following no
		int[]arr1=new int[] {10,4,5,67,8};// define array ka doosra tareeka
		System.out.println(arr.length);
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
		
	}
	public static void Swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}

}
