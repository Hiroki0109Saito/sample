package Y;
import java.util.Scanner;
public class Y_12 {
	public static double pokemon(double n){
		if(n<1){
			return 12345;
		}
		return ((997*pokemon(n-1)+1)%65536);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("ピカピーカ?:");
		int a=scanner.nextInt();
		double sum=0;
		int count=0;

		for(int i=0;i<a;i++){
			System.out.println(pokemon(i)/65536);
			sum+=pokemon(i)/65536;
			count++;
		}
		System.out.println("\n"+"average="+sum/count);
		scanner.close();
	}
}