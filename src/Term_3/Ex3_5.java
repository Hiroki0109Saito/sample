package Term_3;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		System.out.print("整数値:");
		int a=scanner.nextInt();

		if(a>0){
			System.out.println("その値は正です。");
		}
			else if(a==0){
			System.out.println("その値は0です。");
		}else{
			System.out.println("その値は負です。");
		}
		scanner.close();
	}

}
