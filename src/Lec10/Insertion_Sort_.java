package Lec10;

public class Insertion_Sort_{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,7,8,9,11,4};
		InsertLastElement(arr,arr.length-1);{
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}
	public static void sort (int[]arr) {
		
	}
	public static void InsertLastElement(int[]arr,int i) {//i=arr.length-1
		int j=i-1;
		int item=arr[i];
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			arr[j]=item;
			j--;
		}
		
		
	}

}

