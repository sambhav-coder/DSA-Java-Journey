package Lec08;

public class Arrays_Maximum_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,5,1,4,11,40,51,1,15};
		System.out.println(Max_Value(arr));
		

	}
	public static int Max_Value(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		return arr[arr.length-1];
		
	}

}
