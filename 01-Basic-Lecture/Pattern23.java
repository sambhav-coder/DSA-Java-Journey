package LEC02;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=n-1;
		int number=1;
		while(row<=n) {
			// space
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			
			// number 1
			int j=1;
			while(j<=number) {
				System.out.print("1");
				j++;
			}
			System.out.println();
			row++;
			space--;
			number+=2;
		}

	}

}
