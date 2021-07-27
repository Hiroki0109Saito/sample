package Y;
import java.util.Scanner;
public class Y_6 {
	public static int fibo(int n){
		if(n<=1){
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("n:");
		int a=scanner.nextInt();
		for(int i=1;i<=a;i++){
			System.out.print(fibo(i)+" ");
		}
		scanner.close();
	}
}