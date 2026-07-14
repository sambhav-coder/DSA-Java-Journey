package Lec09;

public class Rotate_Array_2 { // monu bhaiya approach , not optimized method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int arr[]= {1,2,3,4,5,6,7};
		Rotate_in_same_array(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Rotate_in_same_array(int[]arr,int k) {
		k=k%arr.length;
		for(int i=1;i<=k;i++) {
			int item=arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--) {
				arr[j+1]=arr[j];
				
				
			}
			arr[0]=item;
		}
	}

}
