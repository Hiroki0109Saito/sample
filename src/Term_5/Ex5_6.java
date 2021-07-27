package Term_5;

import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("整数値とxとyとzの平均値を求めます。");
		System.out.print("xの値:");
		int x=scanner.nextInt();
		System.out.print("yの値:");
		int y=scanner.nextInt();
		System.out.print("zの値:");
		int z=scanner.nextInt();

		System.out.println("xとyとzの値の合計値は"+(x+y+z)+"です。");

		int sum=x+y+z;
		double ave=(double)sum/3;

		System.out.printf("xとyとzの平均値は"+"%.3f"+"です。"+"\n",ave);
		//System.out.printf("xとyとzの平均値は"+(x+y+z)/3+"です。"+"\n");
		// TODO 自動生成されたメソッド・スタブ

		scanner.close();

	}

}
