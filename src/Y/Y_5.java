package Y;

import java.util.Random;
import java.util.Scanner;

public class Y_5 {
	public static int[] ran(int b){
		Random rand =new Random();

		int []a=new int [b];

		for(int i=0;i<b;i++){
			a[i]=rand.nextInt(9)+1;

			for(int j=1;j<=i;j++){
				if(a[i]==a[i-j]){
					i--;
				}
			}			
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner (System.in);

		int []c=new int[4];
		int []d=new int[4];

		c=ran(4);
//
//		for(int i=0;i<4;i++){
//			System.out.print(c[i]);
//		}

		int hit=0;
		int blow=0;
		
		do{
			hit=0;
			blow=0;
			System.out.print("数値を入力してください:");

			int b=scanner.nextInt();

			for(int i=0;i<4;i++){
				d[i]=b/(int)Math.pow(10,3-i);
				b=b-d[i]*(int)Math.pow(10,3-i);
			}

			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i==j){
						if(c[i]==d[j]){
							hit++;
						}
					}else{
						if(c[i]==d[j]){
							blow++;
						}
					}
				}
			}

			System.out.println("hit:"+hit+"blow:"+blow);

		}while(hit!=4);
		System.out.println("せいかいー");

		scanner.close();
	}

}
