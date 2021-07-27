package Term_3;

import java.util.Scanner;

public class Ex3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("実数a:");
		double a=scanner.nextDouble();
		System.out.print("実数b:");
		double b=scanner.nextDouble();

		double n=0;
		
			if(a>b){
				n =a;
			}else{
				n=b;
			}
				System.out.println("大きいほうの値は"+n+"です。");
			
		scanner.close();

	}

}
