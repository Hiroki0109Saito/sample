package Term_6;

import java.util.Scanner;

public class Ex6_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("要素数:");
		int x=scanner.nextInt();
		
		int a[] =new int[x];
		
		for(int i=0;i<x;i++){
			System.out.print("a["+i+"]=");
			a[i]=scanner.nextInt();
		}
		
		System.out.print("{"+a[0]);
		for(int i=1;i<x;i++){
			System.out.print(","+a[i]);
		}
		System.out.println("}");
		scanner.close();
	}

}
