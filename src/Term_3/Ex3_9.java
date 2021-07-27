package Term_3;

import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("整数値:");
		int a=scanner.nextInt();

		if(a>0){
			if(a%10==0){
				System.out.println("その値は10で割り切れます。");
			}else{
				System.out.println("その値は10では割り切れません。");
			}
		}else{
				System.out.println("正でない値が入力されました。");
			}
		scanner.close();

	}

}
