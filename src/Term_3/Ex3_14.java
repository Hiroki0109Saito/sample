package Term_3;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("実数a:");
		double a=scanner.nextDouble();
		System.out.print("実数b:");
		double b=scanner.nextDouble();

		double n=0;
		
			if(a>b){
				n =a-b;
				if(n<=10){
					System.out.println("それらの値の差は10以下です。");
				}else{
					System.out.println("それらの値の差は11以上です。");
				}
			}else{
				n=b-a;
				if(n<=10){
					System.out.println("それらの値の差は10以下です。");
				}else{
					System.out.println("それらの値の差は11以下です。");
				}
				}
			
				
		scanner.close();
	}
	}

