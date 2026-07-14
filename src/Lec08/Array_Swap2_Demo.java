package Lec08;

public class Array_Swap2_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,4,5,67,8};// define array with following no
		System.out.println(arr.length);
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);

	}
	public static void Swap(int[]arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
