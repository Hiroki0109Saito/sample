package Term_7;

import java.util.Random;
import java.util.Scanner;

public class Ex7_8 {

	public static int random(int a,int b){
		Random rand=new Random();
		int r=0;

		if(a<b){
			r=rand.nextInt(b-a+1)+a;
		}else{
			r=a;
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		System.out.println("乱数を生成します。");
		System.out.print("下限値:");
		int x=scanner.nextInt();
		System.out.print("上限値:");
		int y=scanner.nextInt();

		if(y>x){
			System.out.println("生成した乱数は"+random(x,y)+"です。");
		}else{
			System.out.println(random(x,y)+"が返却されました。");
		}

		scanner.close();

	}

}
