package Term_7;

import java.util.Scanner;

public class Ex7_32 {
	public static void printBits(byte x){
		int y=(int) x;
		for (int i = 31; i >= 0; i--){
			System.out.print(((y >>> i & 1) == 1) ? '1' : '0');
		}
	}
	public static void printBits(short x){
		int y=(int) x;
		for (int i = 31; i >= 0; i--){
			System.out.print(((y >>> i & 1) == 1) ? '1' : '0');
		}
	}
	public static void printBits(int x){
		for (int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	public static void printBitS(long x){
		int y=(int) x;
		for (int i = 31; i >= 0; i--){
			System.out.print(((y >>> i & 1) == 1) ? '1' : '0');
		}

	}
	
	public static int rRotate(int x,int n){
		int y = 0;
		y = x >>> n;
		x = x << 32 - n;
		x = y | x;
		return x;
	}
	
	public static int IRotate(int x,int n){
		int y = 0;
		y = x << n;
		x = x >>> 32 - n;
		x = y | x;
		return x;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.println("整数xをnビット回転します。");
		System.out.print("x:");
		int a=scanner.nextInt();
		System.out.print("n:");
		int b=scanner.nextInt();

		System.out.print("回転前:");
		printBits(a);

		int d=rRotate(a,b);
		System.out.print("\n"+"右回転:");
		printBits(d);

		int e=IRotate(a,b);
		System.out.print("\n"+"左回転:");
		printBits(e);

		scanner.close();
	}
}
