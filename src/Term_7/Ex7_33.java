package Term_7;

import java.util.Scanner;

public class Ex7_33 {
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]!=0){
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("1次元配列xの要素数:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("x["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("2次元配列yの要素数:");
		int c=scanner.nextInt();

		int [][]d=new int [c][100];
		int []e=new int [c];

		for(int i=0;i<c;i++){
			System.out.print(i+"行目の列数:");
			e[i]=scanner.nextInt();
		}
		
		System.out.println("各要素の値を入力せよ。");

		for(int i=0;i<c;i++){
			for(int j=0;j<e[i];j++){
				System.out.print("y["+i+"]["+j+"]:");
				d[i][j]=scanner.nextInt();
			}
		}

		System.out.println("\n"+"1次元配列x");
		printArray(b);
		System.out.println("\n"+"2次元配列y");
		printArray(d);

		scanner.close();

	}

}
