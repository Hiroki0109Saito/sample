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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.println("����x��n�r�b�g��]���܂��B");
		System.out.print("x:");
		int a=scanner.nextInt();
		System.out.print("n:");
		int b=scanner.nextInt();

		System.out.print("��]�O:");
		printBits(a);

		int d=rRotate(a,b);
		System.out.print("\n"+"�E��]:");
		printBits(d);

		int e=IRotate(a,b);
		System.out.print("\n"+"����]:");
		printBits(e);

		scanner.close();
	}
}
