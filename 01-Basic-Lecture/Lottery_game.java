package LEC01;

public class Lottery_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=60;
		if(n>=15 && n<=20) {
			if(n>=15 && n<=18) {
				System.out.println("hero bike");
			}
			System.out.println("bike won");
		}
		else if(n>=50 && n<=80) {
			System.out.println("cycle");
		}
		else if(n>=100 && n<=200) {
			System.out.println("car");
		}
		else if(n>=250 && n<=300) {
			System.out.println("mac");
		}
		else if(n>=1200 && n<=1400) {
			System.out.println("kurkure");
		}
		else {
			System.out.println("happy birthday");
		}

	}

}
