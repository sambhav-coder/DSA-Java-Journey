package Lec08;

public class Array_Swap3_Demo{ // swap nhi hoga kyunki hum array main ghus kr change nhi kr rhe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,1,7,8};// define array with following no
		int []other= {31,51,11,71,81};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);

	}
	public static void Swap(int[]arr,int[]other) {
		int[] temp=arr;
		arr=other;
		other=temp;
		
	}

}


