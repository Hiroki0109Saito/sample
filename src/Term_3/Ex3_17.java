package Term_3;

import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("整数a:");
		int a=scanner.nextInt();
		System.out.print("整数b:");
		int b=scanner.nextInt();

		if(a>b){
			System.out.println("大きいほうの値は"+a+"です。");
			System.out.println("小さいほうの値は"+b+"です。");
		}else if(a<b){
			System.out.println("大きいほうの値は"+b+"です。");
			System.out.println("小さいほうの値は"+a+"です。");
		}else{
			System.out.println("二つの値は同じです。");
		}

		// TODO 自動生成されたメソッド・スタブ

		scanner.close();
	}

}
