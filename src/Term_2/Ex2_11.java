package Term_2;

import java.util.Random;

public class Ex2_11 {

	public static void main(String[] args) {

		System.out.println("3個の乱数値を生成しました。");

		Random rand=new Random();
		int a=rand.nextInt(9)+1;
		
		System.out.println("1桁の正の整数:"+a);
		
		int b=(rand.nextInt(9)+1)*-1;
		System.out.println("1桁の負の整数:"+b);
		
		int c=rand.nextInt(90)+10;
		System.out.println("1桁の負の整数:"+c);
		}
	// TODO 自動生成されたメソッド・スタブ
	}

