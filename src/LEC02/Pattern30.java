package LEC02;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int number=n;
		int row=1;
		while(row<=n) {
			//numbers
			int i=0;
			while(i<number) {
				System.out.print(n-i);
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
