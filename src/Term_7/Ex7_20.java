package Term_7;

import java.util.Scanner;

public class Ex7_20 {
	public static void aryIns(int []a,int idx,int x){
		int count=0;
		for(int i=a.length-1;i>idx;i--){
			a[i]=a[i-1];
			count++;
		}
		a[count-1]=x;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []b=new int [a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]:");
			b[i]=scanner.nextInt();
		}
		System.out.print("挿入する要素のインデックス:");
		int c=scanner.nextInt();
		System.out.print("挿入する値:");
		int d=scanner.nextInt();

		aryIns(b,c,d);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]:"+b[i]);
		}
		scanner.close();
	}

}
