package Term_7;

import java.util.Scanner;

public class Ex7_18 {
	public static void aryRmv(int[] a,int idx){
		for(int i=idx;i<a.length-1;i++){
			a[i]=a[i+1];
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("削除する要素のインデックス:");
		int c=scanner.nextInt();

		aryRmv(b,c);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}
		scanner.close();
	}

}
