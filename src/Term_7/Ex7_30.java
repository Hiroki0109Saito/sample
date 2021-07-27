package Term_7;

import java.util.Scanner;

public class Ex7_30 {

	public static int min(int a,int b){

		int min=0;
		if(a>b){
			min=b;
		}else{
			min=a;
		}
		return min;
	}

	public static int min(int a,int b,int c){

		int min=a;

		for(int i=0;i<3;i++){
			if(b<min){
				min=b;
				if(c<min){
					min=c;
				}
			}else if(c<min){
				min=c;
			}
		}
		return min;
	}
	public static int min(int []a){

		int min=a[0];

		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	
		System.out.print("xの値:");
		int a=scanner.nextInt();
		System.out.print("yの値:");
		int b=scanner.nextInt();
		System.out.print("zの値:");
		int c=scanner.nextInt();
		
		System.out.print("配列aの要素数:");
		int r=scanner.nextInt();
		int []num=new int[r];
		
		for(int i=0;i<r;i++){
			System.out.print("a["+i+"]:");
			num[i]=scanner.nextInt();
		}
		
		System.out.println("x,yの最小値は"+min(a,b)+"です。");
		System.out.println("x,y,zの最小値は"+min(a,b,c)+"です。");
		System.out.println("配列aの最小値は"+min(num)+"です。");
		
		scanner.close();
	}

}
