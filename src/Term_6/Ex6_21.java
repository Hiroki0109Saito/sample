package Term_6;

import java.util.Scanner;

public class Ex6_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("クラス数:");
		int a=scanner.nextInt();

		int []c=new int [a];
		double []ave=new double[a];
		int sum=0;
		int y=0;

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"組の人数:");
			int b=scanner.nextInt();
			for(int j=0;j<b;j++){
				System.out.print((i+1)+"組"+(j+1)+"番の点数:");
				c[i]+=scanner.nextInt();
				y++;
			}
			System.out.println();
			ave[i]=((double)c[i])/b;
			sum+=c[i];
		}

		System.out.println(" 組|  合計 平均");
		System.out.println("-----------------");
		for(int i=0;i<a;i++){
			System.out.printf((i+1)+"組|  "+c[i]+"  "+"%.1f%n",ave[i]);
		}
		System.out.println("-----------------");
		System.out.printf("計 |  "+sum+"  %.1f%n",((double)sum)/y);

		scanner.close();
	}
}