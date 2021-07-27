package Term_3;

import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);

		int []ten=new int[3];

		System.out.print("整数a:");
		ten[0]=scanner.nextInt();
		System.out.print("整数b:");
		ten[1]=scanner.nextInt();
		System.out.print("整数c:");
		ten[2]=scanner.nextInt();

		int t=0;

		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++){
				if(ten[i]>ten[j]){
					t=ten[i];
					ten[i]=ten[j];
					ten[j]=t;
				}
			}

		}

		System.out.println("\n"+"a≧b≧cとなるようにソートしました。");
		System.out.println("整数a:"+ten[0]+"です。");
		System.out.println("整数b:"+ten[1]+"です。");
		System.out.println("整数c:"+ten[2]+"です。");

		scanner.close();
	}

}
