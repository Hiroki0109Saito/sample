package Term_7;

import java.util.Scanner;

public class Ex7_31 {

	public static int absolute(int x){
		return Math.abs(x);
	}
	public static long absolute(long x){
		return Math.abs(x);
	}
	public static float absolute(float x){
		return Math.abs(x);
	}
	public static double absolute(double x){
		return Math.abs(x);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("int型の整数aの値:");
		int a=scanner.nextInt();
		System.out.print("long型の整数bの値:");
		long b=scanner.nextLong();
		System.out.print("float型の整数cの値:");
		float c=scanner.nextFloat();
		System.out.print("double型の整数dの値:");
		double d=scanner.nextDouble();

		System.out.println("aの絶対値は"+absolute(a)+"です。");
		System.out.println("bの絶対値は"+absolute(b)+"です。");
		System.out.println("cの絶対値は"+absolute(c)+"です。");
		System.out.println("dの絶対値は"+absolute(d)+"です。");

		scanner.close();
	}
}