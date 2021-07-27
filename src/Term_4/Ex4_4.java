package Term_4;
import java.util.Scanner;


public class Ex4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("整数A:");
		int a=scanner.nextInt();
		System.out.print("整数B:");
		int b=scanner.nextInt();

		int num=0;
		
		if(a>b){
			num=a;
			a=b;
			b=num;
		}
		
		for(int i=a;i<b+1;i++){
			System.out.print(i+" ");
		}
		System.out.println();
		scanner.close();
	}
	}


