package Term_6;

import java.util.Scanner;

public class Ex6_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.println("凸凹な２次元配列を作ります。");
		System.out.print("行数:");
		int a=scanner.nextInt();

		int []retu=new int[a];

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"行目の列数:");
			retu[i]=scanner.nextInt();
		}

		int [][]c=new int [a][100];

		System.out.println("各要素の値を入力せよ。");

		for(int i=0;i<a;i++){
			for(int j=0;j<retu[i];j++){
				System.out.print("c["+i+"]["+j+"]:");
				c[i][j]=scanner.nextInt();
			}
		}

		System.out.println("配列cの各要素の値は次のようになっています。");

		for(int i=0;i<a;i++){
			for(int j=0;j<retu[i];j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

		scanner.close();
	}
}
