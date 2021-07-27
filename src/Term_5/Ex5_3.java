package Term_5;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("x:");
		float a=scanner.nextFloat();
		System.out.print("y:");
		double b=scanner.nextDouble();

		System.out.printf("x="+"%.8f%n",a);
		System.out.printf("x="+"%.17f%n",b);

		scanner.close();
	}
}