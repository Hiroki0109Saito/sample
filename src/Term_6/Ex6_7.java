package Term_6;

import java.util.Scanner;

public class Ex6_7 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.print("人数:");
		int a=scanner.nextInt();

		System.out.println("点数を入力せよ。");

		int[] ten=new int[a];
		int sum=0;

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"番目の点数:");
			ten[i]=scanner.nextInt();
			sum+=ten[i];
		}

		double ave=(double)sum/a;

		int max=ten[0];
		int min=ten[0];

		for(int j=0;j<a;j++){
			if(max<ten[j]){
				max=ten[j];
			}else if(min>ten[j]){
				min=ten[j];
			}else{
			}
		}

		System.out.println("合計点は"+sum+"点です。");
		System.out.println("平均点は"+ave+"点です。");
		System.out.println("最高点は"+max+"点です。");
		System.out.println("最低点は"+min+"点です。");
		// TODO 自動生成されたメソッド・スタブ

		scanner.close();

	}

}
