package Term_4;

import java.util.Scanner;

public class Ex4_27 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか:");
		int a=scanner.nextInt();

		int b=a;
		int count=0;
		int num=0;
		int sum=0;

		do{
			System.out.print("整数:");
			num=scanner.nextInt();
			sum+=num;
			if(sum>1000){
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");
				sum-=num;
				break;
			}
			count++;
			b--;
		}while(b!=0);

		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+sum/count+"です。");

		scanner.close();

	}

}
