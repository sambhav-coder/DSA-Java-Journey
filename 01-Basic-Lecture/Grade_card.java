package LEC01;

public class Grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=50;
		if(m>=75) {
			System.out.println("grade=A");
		}
		else if(m>=65 && m<75) {
			System.out.println("grade=B");
		}
		else if(m>=55 && m<65) {
			System.out.println("grade=C");
		}
		else if(m>=45 && m<55) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
