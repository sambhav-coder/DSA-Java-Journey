package Lec08;

public class Linear_Search {// element kaunse index pe hai dhundo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,3,4,6,7,9};
		int item=6;
		System.out.println(linear_search(arr,item));
		
	}
	public static int linear_search(int[]arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
