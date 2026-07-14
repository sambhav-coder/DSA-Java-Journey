package Lec08;

public class Array_Swap4_Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,1,7,8};// define array with following no
		int []other= {31,51,11,71,81};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other,0,0);
		System.out.println(arr[0]+" "+other[0]);

	}
	public static void Swap(int[]arr,int[]other,int i,int j) {
		int temp=arr[i];
		arr[i]=other[j];
		other[j]=temp;
		
	}

}

