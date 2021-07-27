package Term_7;

import java.util.Scanner;

public class Ex7_19 {
	public static void aryRmvN(int []a,int idx,int n){
		//		for(int i=a.length-1;i>a.length-idx;i--){
		//			a[i-n]=a[i];
		//		}

		for(int i=idx;i+n<a.length;i++){//一番最後の配列に届いたら終了
			a[i]=a[i+n];
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []b=new int[a];

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]=");
			b[i]=scanner.nextInt();
		}

		System.out.print("削除する要素のインデックス:");
		int c=scanner.nextInt();
		System.out.print("削除する要素の個数:");
		int d=scanner.nextInt();

		aryRmvN(b,c,d);

		for(int i=0;i<a;i++){
			System.out.println("a["+i+"]="+b[i]);
		}
		scanner.close();
	}

}
