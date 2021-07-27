package Term_6;

import java.util.Scanner;

public class Ex6_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []q=new int[a];
		int []r=new int[a];
		int i=0;

		for(i=0;i<a;i++){
			System.out.print("a["+i+"]=");
			q[i]=scanner.nextInt();
		}
		
		i=0;
		
		for(int j=a-1;j>=0;j--){
			r[j]=q[i];
			i++;
		}
		
		System.out.println("aの要素をbの要素に逆順にコピーしました。");
		for(i=0;i<a;i++){
			System.out.println("b["+i+"]="+r[i]);
		}
		scanner.close();

	}

}
