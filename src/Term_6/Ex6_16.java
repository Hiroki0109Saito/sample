package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		String []eng=new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String []jap=new String[]{"日","月","火","水","木","金","土"};

		String str="";
		System.out.println("英語の曜日名を小文字で入力してください。");

		int b=1;
		int t=0;
		int a=0;
		int s=1;

		do{
			do{
				t=rand.nextInt(7);
			}while(a==t);

			a=t;
			do{
				System.out.print(jap[a]+"曜日:");
				str=scanner.next();
				if(str.equals(eng[a])){
					System.out.print("正解です。");
					System.out.print("もう一度? 1…Yes/0…No:");
					b=scanner.nextInt();
					break;
				}else{
					System.out.print("違います。どうしますか?1…再入力/0…正解を見る");
					s=scanner.nextInt();
					if(s==0){
						System.out.println(jap[a]+"は"+eng[a]+"です。");
						System.out.print("もう一度? 1…Yes/0…No:");
						b=scanner.nextInt();
					}
				}
			}while(s==1);
		}while(b==1);
		scanner.close();
	}
}
