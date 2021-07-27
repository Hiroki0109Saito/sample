package Term_4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_30 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.println("数当てゲーム開始!!"+"\n"+"0~99の数を当ててください。");
		int a=rand.nextInt(100);
		int b=0;
		int g=6;

		//		System.out.println(a);

		while(a!=b&&0<g){
			System.out.print("残り"+g+"回。"+"いくつかな:");
			b=scanner.nextInt();

			if(g==1){
				g--;
				break;
			}
			if(a>b){
				System.out.println("もっと大きな数だよ。");
			}else if(a<b){
				System.out.println("もっと小さな数だよ。");
			}
			g--;
		}

		if(a==b){
			System.out.println((6-g)+"回で当たりましたね。");
		}else{
			System.out.println("はずれ！！！");
		}

		scanner.close();

	}

}
