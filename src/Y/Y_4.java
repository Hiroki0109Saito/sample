package Y;

import java.util.Random;
import java.util.Scanner;

public class Y_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		int same=0;
		int win=0;
		int lose=0;

		while(true){
			System.out.print("じゃーんけーんぽいっ!!!!!!(G or T or P)");
			String str=scanner.next();

			int a=rand.nextInt(3);

			switch(a){
			case 0:	//G
				if(str.equals("G")){
					System.out.println("あいこ！");
					same++;
				}else if(str.equals("T")){
					System.out.println("勝ち！");
					win++;
				}else{
					System.out.println("まけです");
					lose++;
				}
				break;
			case 1: //T
				if(str.equals("G")){
					System.out.println("まけです");
					lose++;
				}else if(str.equals("T")){
					System.out.println("あいこ！");
					same++;
				}else{
					System.out.println("勝ち！");
					win++;
				}
				break;
			case 2: //P
				if(str.equals("G")){
					System.out.println("勝ち！");
					win++;
				}else if(str.equals("T")){
					System.out.println("まけです");
					lose++;
				}else{
					System.out.println("あいこ！");
					same++;
				}
				break;
			}

			System.out.print("もう一度やるんご？(やるお…0/やらない…1)");
			int b=scanner.nextInt();

			if(b==1){
			break;
			}
		}

		System.out.println("勝:"+win);
		System.out.println("負:"+lose);
		System.out.println("あいこ:"+same);

		scanner.close();
	}

}
