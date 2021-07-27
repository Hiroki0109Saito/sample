package Term_3;

import java.util.Scanner;

public class Ex3_15 {

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
		
		int max=ten[0];
		int min=ten[0];

		for(int j=0;j<3;j++){
			if(max<ten[j]){
				max=ten[j];
			}else if(min>ten[j]){
				min=ten[j];
			}else{
			}
		}
		System.out.println("最小値は"+min+"です。");
		scanner.close();
	}

}
