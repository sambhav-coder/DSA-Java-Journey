package Lec09;

public class Rain_Trapping_Leet_MYlogic {// my own logic done complete without seeing sol

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]height= {0,1,0,2,1,0,1,3,2,1,2,1};
		int []leftmax= new int [height.length];
		int[]rightmax=new int[height.length];
		int[]minimum=new int[height.length];
		leftMax(height,leftmax);
		rightmax(height,rightmax);
		minimum(minimum,leftmax,rightmax);
		for(int i=0;i<leftmax.length;i++) {
			System.out.print(leftmax[i]+" ");
		}
		System.out.println();
		for(int j=0;j<rightmax.length;j++) {
			System.out.print(rightmax[j]+" ");
		}
		System.out.println();
		for(int k=0;k<minimum.length;k++) {
			System.out.print(minimum[k]+" ");
		}
		System.out.println();
		water(height,minimum);

	}
	public static void leftMax(int[]height,int[]leftmax) {
		leftmax[0]=height[0];
		for(int i=1;i<height.length;i++) {
			if(height[i]>leftmax[i-1]) {
				leftmax[i]=height[i];
			}
			else {
				leftmax[i]=leftmax[i-1];
			}
			
			
			
		}
		
	}
	public static void rightmax(int[]height,int[]rightmax) {
		int n=height.length;
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			if(height[i]>rightmax[i+1]) {
				rightmax[i]=height[i];
			}
			else {
				rightmax[i]=rightmax[i+1];
			}
		}
		
	}
	public static void minimum(int[]minimum,int[]leftmax,int[]rightmax) {
		int n=minimum.length;
		for(int i=0;i<n;i++) {
			minimum[i]=Math.min(leftmax[i],rightmax[i]);
		}
		
		
		
	}
	public static void water(int[]height,int[]minimum) {
		int total=0;
		for(int i=0;i<height.length;i++) {
			int water=(minimum[i]-height[i]);
			total=total+water;
		}
		System.out.println(total);
		
		
	}
	

}
