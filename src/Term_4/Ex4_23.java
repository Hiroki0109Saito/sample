package Term_4;
import java.util.Scanner;
public class Ex4_23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.println("ピラミッドを表示します。");
		System.out.print("段数は:");
		int n=scanner.nextInt();
		int r=n;

		for(int i=1;i<n+1;i++){
			for(int q=1;q<r;q++){
				System.out.print(" ");
			}
			r--;
			for(int j=0;j<(i-1)*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}