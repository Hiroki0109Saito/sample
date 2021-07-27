package Term_4;

import java.util.Scanner;

public class Ex4_25 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		System.out.print("2以上の整数値:");
		int a=scanner.nextInt();
		int x=0;
		int count=2;
		int y=0;

		do{
			x=a%count;
			count++;
			if(x==0){
				y++;
			}
		}while(x!=0&&count<a);

		if(0<y){
			System.out.println("それは素数ではありません。");
		}else{
			System.out.println("それは素数です。");
		}
		scanner.close();

	}

}


//	for(int j=0;j<a;j++){
//			if(a%x==0){
//				num[i]=x;
//				x++;
//				i++;
//			}else{
//				x++;
//			}
//		}
//
//		int t=0;
//		do{
//			System.out.print(num[t]+" ");
//			t++;
//		}while(num[t]>0);
//		System.out.println("\n"+"約数は"+i+"個です。");
