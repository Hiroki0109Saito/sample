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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("int�^�̐���a�̒l:");
		int a=scanner.nextInt();
		System.out.print("long�^�̐���b�̒l:");
		long b=scanner.nextLong();
		System.out.print("float�^�̐���c�̒l:");
		float c=scanner.nextFloat();
		System.out.print("double�^�̐���d�̒l:");
		double d=scanner.nextDouble();

		System.out.println("a�̐�Βl��"+absolute(a)+"�ł��B");
		System.out.println("b�̐�Βl��"+absolute(b)+"�ł��B");
		System.out.println("c�̐�Βl��"+absolute(c)+"�ł��B");
		System.out.println("d�̐�Βl��"+absolute(d)+"�ł��B");

		scanner.close();
	}
}