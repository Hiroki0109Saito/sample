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
	
		System.out.print("x�̒l:");
		int a=scanner.nextInt();
		System.out.print("y�̒l:");
		int b=scanner.nextInt();
		System.out.print("z�̒l:");
		int c=scanner.nextInt();
		
		System.out.print("�z��a�̗v�f��:");
		int r=scanner.nextInt();
		int []num=new int[r];
		
		for(int i=0;i<r;i++){
			System.out.print("a["+i+"]:");
			num[i]=scanner.nextInt();
		}
		
		System.out.println("x,y�̍ŏ��l��"+min(a,b)+"�ł��B");
		System.out.println("x,y,z�̍ŏ��l��"+min(a,b,c)+"�ł��B");
		System.out.println("�z��a�̍ŏ��l��"+min(num)+"�ł��B");
		
		scanner.close();
	}

}
