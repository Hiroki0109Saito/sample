package Term_2;

import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("三角形の面積を求めます。");
		System.out.print("底辺:");
		double a=scanner.nextDouble();
		System.out.print("高さ:");
		double b=scanner.nextDouble();

		System.out.println("面積は"+a*b/2+"です。");

		scanner.close();

		// TODO 自動生成されたメソッド・スタブ

	}

}
