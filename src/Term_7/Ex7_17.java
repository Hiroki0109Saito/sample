package Term_7;

import java.util.Scanner;

public class Ex7_17 {

	public static int linearSearch(int []a,int key){
		int i=0;
		int x=0;
		for(int n:a){
			i++;
			n=n*1;
		}

		for(int j=0;j<i;j++){
			if(a[j]==key){
				x=j;
				break;
			}
		}
		return x;
	}

	public static int linearSearchR(int []a,int key){
		int i=0;
		int x=0;

		for(int n:a){
			i++;
			n=n*1;
		}

		for(int j=i-1;j>=0;j--){
			if(a[j]==key){
				x=j;
				break;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);

		System.out.print("要素数:");
		int a=scanner.nextInt();

		int []num=new int [a];

		for(int i=0;i<a;i++){
			System.out.print("x["+i+"]:");
			num[i]=scanner.nextInt();
		}

		System.out.print("探す値:");
		int b=scanner.nextInt();

		int p=linearSearch(num,b);
		int q=linearSearchR(num,b);

		if(p==q){
			System.out.println("その値はx["+p+"]にあります。");
		}else{
			System.out.println("先端はx["+p+"]にあります。");
			System.out.println("末尾はx["+q+"]にあります。");
		}
		scanner.close();
	}

}
