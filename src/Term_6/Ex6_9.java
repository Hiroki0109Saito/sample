package Term_6;
import java.util.Scanner;


public class Ex6_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		double[] ten=new double[a];
		double sum=0;

		for(int i=0;i<a;i++){
			System.out.print("a["+i+"]=");
			ten[i]=scanner.nextDouble();
			sum+=ten[i];
		}

		double ave=sum/a;

		System.out.printf("全要素の合計は"+"%.1f"+"点です。%n",sum);
		System.out.printf("全要素の平均は"+"%.2f"+"点です。%n",ave);

		// TODO 自動生成されたメソッド・スタブ

		scanner.close();

	}

}
