package LEC01;

public class Lottery_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=60;
		if(n>=15 && n<=20) {
			if(n>=15 && n<=18) {
				System.out.println("hero bike");
			}
			else {
				System.out.println("ktm");
			}
			System.out.println("bike won");
		}
		else if(n>=50 && n<=80) {
			if(n>=50 && n<=70) {
				System.out.println("Automatic cycle");
			}
			else {
				System.out.println("manual cycle");
			}
			System.out.println("cycle");
		}
		else if(n>=100 && n<=200) {
			if(n>=100 && n<=151) {
				System.out.println("thar");
			}
			else {
				System.out.println("creta");
			}
			System.out.println("car");
		}
		else if(n>=250 && n<=300) {
			if(n>=250 && n<=261) {
				System.out.println("m1");
			}
			else {
				System.out.println("m2");
			}
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

