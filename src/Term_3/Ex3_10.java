package Term_3;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("整数値:");
		int a=scanner.nextInt();

		if(a>0){
			if(a%3==0){
				System.out.println("その値は3で割り切れます。");
			}else if(a%3==1){
				System.out.println("その値を3で割ったあまりは1です。");
			}else if(a%3==2){
				System.out.println("その値を3で割ったあまりは2です。");
			}
		}else{
				System.out.println("正でない値が入力されました。");
			}
		scanner.close();
		// TODO 自動生成されたメソッド・スタブ

	}

}
