package Term_4;
import java.util.Scanner;
public class Ex4_17 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("何個*を表示しますか:");
		int a=scanner.nextInt();

		for(int i=0;i<a;i++){
			System.out.print("*");

			if(i%5==4)
				System.out.println();
		}
		scanner.close();
	}
}


//		do{
//			for(int j=0;j<5;j++){
//				System.out.print("*");
//			}
//			System.out.println();
//			a=a-5;
//		}while(a>=5);
//
//		for(int i=0;i<a;i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//		scanner.close();
//
//	}
//
//}
