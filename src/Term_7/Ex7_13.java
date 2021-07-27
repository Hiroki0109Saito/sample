package Term_7;
import java.util.Scanner;

public class Ex7_13 {
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--){
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	public static int set(int x,int pos){
		int w=0;
		int z=0;

		for (int i = 31; i >= 0; i--){
			if(i==pos){
				w=1;//1いれる。
			}else{
				w=(((x >>> i & 1) >0) ? 1 : 0);
			}
			for(int o=i;o>0;o--){
				w=w*2;
			}
			z+=w;
		}
		return z;
	}
	public static int reset(int x,int pos){
		int w=0;
		int z=0;

		for (int i = 31; i >= 0; i--){
			if(i==pos){
				w=0;//0いれる。
			}else{
				w=(((x >>> i & 1) >0) ? 1 : 0);
			}
			for(int o=i;o>0;o--){
				w=w*2;
			}
			z+=w;
		}
		return z;
	}
	public static int inverse(int x,int pos){
		int w=0;
		int z=0;

		for (int i = 31; i >= 0; i--){
			if(i==pos){
				w=(((x >>> i & 1) >0) ? 0 : 1);//逆いれる。
			}else{
				w=(((x >>> i & 1) >0) ? 1 : 0);
			}
			for(int o=i;o>0;o--){
				w=w*2;
			}
			z+=w;
		}
		return z;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.println("整数xのposビット目を操作します。");
		System.out.print("x:");
		int a=scanner.nextInt();
		System.out.print("pos:");
		int b=scanner.nextInt();

		System.out.print("x      =");
		printBits(a);
		System.out.print("\n"+"set    =");
		int c=set(a,b);
		printBits(c);
		System.out.print("\n"+"reset  =");
		int d=reset(a,b);
		printBits(d);
		System.out.print("\n"+"inverse=");
		int e=inverse(a,b);
		printBits(e);

		scanner.close();
	}
}
