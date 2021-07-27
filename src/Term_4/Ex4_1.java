package Term_4;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		int b=1;

		while(b==1){
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
		System.out.print("もう一度? 1…Yes/0…No");
		b=scanner.nextInt();
		}
		scanner.close();
	}
}
