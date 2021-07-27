package Term_7;

import java.util.Scanner;

public class Ex7_3 {
	public static int med(int a,int b,int c){

		int []ten=new int[3];

		ten[0]=a;
		ten[1]=b;
		ten[2]=c;

		int max=ten[0];
		int min=ten[0];
		int x=0;

		for(int j=0;j<3;j++){
			if(max<ten[j]){
				max=ten[j];
			}else if(min>ten[j]){
				min=ten[j];
			}else{
			}
		}

		if(ten[0]==min){
			if(ten[1]==max){
				x=ten[2];
			}else{
				x=ten[1];
			}
		}else if(ten[1]==min){
			if(ten[0]==max){
				x=ten[2];
			}else{
				x=ten[0];
			}
		}else{
			if(ten[0]==max){
				x=ten[1];
			}else{
				x=ten[0];
			}
		}
		return x;
	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("整数a:");
		int w=scanner.nextInt();
		System.out.print("整数b:");
		int q=scanner.nextInt();
		System.out.print("整数c:");
		int y=scanner.nextInt();


		System.out.println("\n"+"中央値は"+med(w,q,y)+"です。");

		scanner.close();
	}

}
