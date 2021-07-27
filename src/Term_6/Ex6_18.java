package Term_6;

import java.util.Scanner;

public class Ex6_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		int [][]a=new int[3][2];
		int [][]b=new int[2][3];

		System.out.println("行列aの要素の値を入力せよ。");//配列aに代入
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print("a["+i+"]["+j+"]:");
				a[i][j]=scanner.nextInt();
			}
		}

		System.out.println("行列bの要素の値を入力せよ。");//配列bに代入
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print("b["+i+"]["+j+"]:");
				b[i][j]=scanner.nextInt();
			}
		}

		System.out.println("行列aとbの積");//行列aとbの積を計算
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((a[i][0]*b[0][j]+a[i][1]*b[1][j])+" ");
			}
			System.out.println();
		}

		//	(i=0,j=0) a00*b00+a01*b10 (i=0,j=1) a00*b01+a01*b11 (i=0,j=2) a00*b02+a01*b12
		//	(i=1,j=0) a10*b00+a11*b10 (i=1,j=1) a10*b01+a11*b11 (i=1,j=2) a10*b02+a11*b12
		//	(i=2,j=0) a20*b00+a21*b10 (i=2,j=1) a20*b01+a21*b11 (i=2,j=2) a20*b02+a21*b12

		scanner.close();
	}
}
