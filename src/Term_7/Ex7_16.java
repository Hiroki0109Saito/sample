package Term_7;

import java.util.Scanner;

public class Ex7_16 {

	public static int minOf(int[] a){
		int min=a[0];

		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return  min;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner =new Scanner(System.in);

		System.out.print("人数は:");
		int a=scanner.nextInt();
		System.out.println(a+"人の身長と体重を入力せよ。");

		int []b=new int[a];
		int []c=new int[a];

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"番目の身長:");
			b[i]=scanner.nextInt();
			System.out.print((i+1)+"番目の体重:");
			c[i]=scanner.nextInt();
		}

		System.out.println("最も背が低い人の身長:"+minOf(b)+"cm");
		System.out.println("最も痩せている人の体重:"+minOf(c)+"kg");

		scanner.close();
	}

}
