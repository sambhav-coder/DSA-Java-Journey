package LEC02;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=n;
		int row=1;
		while(row<=n) {
			// star
			int i=1;
			while(i<=star) {
				if(row==1 || row==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("*   *");
				}
				i++;
			}
			System.out.println();
			row++;
		}

	}

}
