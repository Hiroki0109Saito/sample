package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []num=new int[a];
		int i=0;

		while(i<a){
			num[i]=rand.nextInt(10)+1;
			if(i!=0){
				if(num[i]==num[i-1]){
					i--;
				}
			}
			i++;
		}

		for(i=0;i<a;i++){
			System.out.println("a["+i+"]="+num[i]);
		}

		scanner.close();

	}

}
