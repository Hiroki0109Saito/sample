package Term_4;
import java.util.Scanner;
public class Ex4_15 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");
		System.out.print("nの値:");
		int a=scanner.nextInt();

		int sum=0;

		for(int i=1;i<a+1;i++){
			System.out.print(i);
			sum+=i;

			if(i==a)  //ループ脱出
				break;

			System.out.print("+");
		}

		System.out.println("="+sum);
		scanner.close();
	}
}
