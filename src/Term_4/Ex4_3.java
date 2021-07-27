package Term_4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("数当てゲーム開始!!"+"\n"+"10~99の数を当ててください。");
		int a=rand.nextInt(90)+10;
		int b=0;

		while(a!=b){
			System.out.print("いくつかな:");
			b=scanner.nextInt();
			if(a>b){
				System.out.println("もっと大きな数だよ。");
			}else if(a<b){
				System.out.println("もっと小さな数だよ。");
			}
		}
		System.out.println("正解です。");
		scanner.close();
	
	}

}
