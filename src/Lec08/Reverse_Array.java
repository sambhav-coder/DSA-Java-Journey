package Lec08;

public class Reverse_Array { // M1 OF REVERSE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,45,3,6,7,9,2};
		Reverse(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
	public static void Reverse(int[]arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
	}

}
