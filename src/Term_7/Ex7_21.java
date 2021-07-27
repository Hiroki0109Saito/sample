package Term_7;

import java.util.Scanner;

public class Ex7_21 {
	public static void aryExChng(int[] a,int[] b){
		int num=0;
		if(a.length>b.length){
			for(int i=0;i<b.length;i++){
				num=a[i];
				a[i]=b[i];
				b[i]=num;
			}
		}else{
			for(int i=0;i<a.length;i++){
				num=a[i];
				a[i]=b[i];
				b[i]=num;
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.print("配列aの要素数:");
		int a=scanner.nextInt();

		int[]b=new int [a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}

		System.out.print("配列bの要素数:");
		int c=scanner.nextInt();

		int[]d=new int [c];

		for(int i=0;i<c;i++){
			System.out.print("b["+i+"]:");
			d[i]=scanner.nextInt();
		}

		aryExChng(b,d);

		System.out.println("配列aと配列bの全要素を交換しました。");

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}

		for(int i=0;i<c;i++){
			System.out.println("b["+i+"]:"+d[i]);
		}

		scanner.close();
	}

}
