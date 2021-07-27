package Term_6;

import java.util.Scanner;

public class Ex6_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		int [][]a=new int [6][2];

		System.out.println("6人の国語・数学の点数を入力せよ。");

		for(int i=0;i<6;i++){
			System.out.print((i+1)+"番 国語 ");
			a[i][0]=scanner.nextInt();
			System.out.print("    数学 ");
			a[i][1]=scanner.nextInt();
		}

		int suma=0;
		int sumb=0;

		for(int i=0;i<6;i++){
			suma+=a[i][0];
			sumb+=a[i][1];
		}

		System.out.println("No.  国語  数学  平均");
		for(int i=0;i<6;i++){
		System.out.println((i+1)+"番   "+a[i][0]+"    "+a[i][1]+"   "+((double)(a[i][0]+a[i][1]))/2);
		}
		System.out.println("平均 "+((double)suma)/6+"  "+((double)sumb)/6);

		scanner.close();
	}

}
