package Term_4;
import java.util.Scanner;


public class Ex4_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("正方形を表示します。");
		System.out.print("段数は:");
		int a=scanner.nextInt();

		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
