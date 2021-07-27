package Term_3;

import java.util.Scanner;

public class Ex3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		System.out.print("実数a:");
		int a=scanner.nextInt();
		System.out.print("実数b:");
		int b=scanner.nextInt();

		int n=0;
		int m=0;

		if(a>b){
			n =a;
			m=b;
		}else{
			n=b;
			m=a;
		}
		System.out.println("\n"+"a≧bとなるようにソートしました。");
		System.out.println("整数a:"+n+"です。");
		System.out.println("整数b:"+m+"です。");

		scanner.close();

	}
}
