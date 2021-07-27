package Term_3;

import java.util.Random;


public class Ex3_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random();

		System.out.print("乱数:");
		int b=rand.nextInt(3);
		System.out.println(b);

		switch (b) {
		case 0 : System.out.println("コンピュータが生成した手:グー");
		break;
		case 1 : System.out.println("コンピュータが生成した手:チョキ");
		break;
		case 2 : System.out.println("コンピュータが生成した手:パー");
		break;
		}
	}

}
