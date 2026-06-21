package LEC01;

public class Maximum_3_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=19;
		int c=5;
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) { // else if isliye likha kyunki dependent bnana tha cond s
			System.out.println(b);
			
		}
		else{
			System.out.println(c);
		}

	}

}
