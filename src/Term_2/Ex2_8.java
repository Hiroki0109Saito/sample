package Term_2;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("xの値:");
		String x=scanner.next();
		System.out.print("yの値:");
		String y=scanner.next();

		double sum=Double.parseDouble(x)+Double.parseDouble(y);
		double ave=sum/2;

		System.out.printf("合計は"+"%.2f"+"です。"+"\n",sum);
		System.out.printf("平均は"+"%.3f"+"です。"+"\n",ave);

		// TODO 自動生成されたメソッド・スタブ

		scanner.close();
	}

}
