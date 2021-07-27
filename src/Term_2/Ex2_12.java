package Term_2;

import java.util.Random;
import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.print("整数値:");
		int a=scanner.nextInt();

		int b=rand.nextInt(11)+a-5;

		System.out.println("その値±5の乱数を生成しました。");
		System.out.println("値は"+b+"です。");

		scanner.close();
		// TODO 自動生成されたメソッド・スタブ

	}

}
