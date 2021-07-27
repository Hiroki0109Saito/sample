package Term_4;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		System.out.println("季節を求めます。");
		int x=1;
		int a=0;

		do{
			do{
				System.out.print("何月ですか:");
				a=scanner.nextInt();
			}while(a<1||12<a);

			if(2<a&&a<6){
				System.out.println("それは春です。");
			}else if(5<a&&a<9){
				System.out.println("それは夏です。");
			}else if(8<a&&a<12){
				System.out.println("それは秋です。");
			}else{
				System.out.println("それは冬です。");
			}

			System.out.print("もう一度? 1…Yes/0…No");
			x=scanner.nextInt();
		}while(x==1);
		scanner.close();
	}
}