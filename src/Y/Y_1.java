package Y;

import java.util.Scanner;

public class Y_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		long start =System.currentTimeMillis();

		Scanner scanner=new Scanner(System.in);

		System.out.print("数値を入力してください:");
		int a=scanner.nextInt();


		for(int i=1;i<a+1;i++){
			int count=0;

			for(int j=1;j<i;j++){
				if(i%j==0){
				}else{	//iが割り切れない時はcount++
					count++;
				}

				if(i==(count+2)){	//iとcountが同じときiは素数
					System.out.println(i);
				}

			}
		}

		long end=System.currentTimeMillis();

		System.out.println("処理時間は"+(end-start)+"msです。");

		scanner.close();
	}
}
