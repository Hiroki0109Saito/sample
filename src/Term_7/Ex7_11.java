package Term_7;
import java.util.Scanner;


public class Ex7_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("整数xをnビットシフトします。");
		System.out.print("x:");
		int a=scanner.nextInt();
		System.out.print("n:");
		int b=scanner.nextInt();
		
		System.out.println("[a]x*(2の"+b+"乗)="+a*(int)Math.pow(2,b));
		System.out.println("[b]x/(2の"+b+"乗)="+a/(int)Math.pow(2,b));
		int n=a<<b;
		int m=a>>b;
		System.out.println("[c]x<<"+b+"="+n);
		System.out.println("[d]x>>"+b+"="+m);
		System.out.println("[a]と[c]の値は一致します。");
		System.out.println("[b]と[d]の値は一致します。");
		
		scanner.close();
	}

}
