package Lec09;

public class Rotate_Array { //my approach

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int arr[]= {1,2,3,4,5,6,7};
		int other[]=new int[arr.length];
		Rotate(arr,other,k);
		for(int i=0;i<other.length;i++) {
			System.out.print(other[i]+" ");
		}

	}
	public static void Rotate(int[]arr,int[]other,int k) {
		for(int i=0;i<arr.length;i++) {
			int m=i+k;
			other[m%arr.length]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=other[i];
		}
		
	}
}
