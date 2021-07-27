package Y;

import java.util.Scanner;

public class Y_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		System.out.println("enter your score:");
		String point=scanner.nextLine();

		System.out.println("南海:");
		int a=scanner.nextInt();

		System.out.println(point);

		String str[]=point.split(" ");

		int []num=new int[a];
		int sum=0;
		int strike=0;
		int nostrike=0;
		int spare=0;
		int round=0;
		int half=0;

		System.out.println(num.length);
		System.out.println(str.length);

		for(int i=0;i<a;i++){
			num[i]=Integer.parseInt(str[i]);
			System.out.println("str["+i+"]="+str[i]);
		}

		for(int i=0;i<num.length-2;i++){//最後の弐回までやる
			if(num[i]==10){
				sum+=(num[i]+num[i+1]+num[i+2]);
				strike++;
				round++;
			}else{
				if((i+1)!=num.length){
					if(num[i]+num[i+1]==10){
						sum=sum+num[i]+num[i+1]+num[i+1];
						i++;
						spare++;
						round++;
					}else{
						sum+=num[i];
						nostrike++;
						half++;
						if(half%2==0)
							round++;
					}
				}

			}
			System.out.println(round+"round:"+sum);
		}

		System.out.println("sum:"+sum);
		System.out.println("strike:"+strike+" spare:"+spare+" nostrike:"+nostrike);
		scanner.close();
	}
}