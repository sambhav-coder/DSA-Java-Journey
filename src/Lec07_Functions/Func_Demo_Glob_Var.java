package Lec07_Functions;

public class Func_Demo_Glob_Var {
	static int val=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a=9;
		int b=8;
		System.out.println(val);
		System.out.println(add(a,b));
		System.out.println(val);
		System.out.println("bye");

	}
	public static int add(int a,int b) {
		int c=a+b;
		int val=90;
		val=val-5;
		System.out.println(val);
		Func_Demo_Glob_Var.val=Func_Demo_Glob_Var.val - 5;
		return c + sub(c,a);
	}
	public static int sub(int a, int b) {
		int c=a-b;
		return c;
	}

}
