package Term_7;

import java.util.Scanner;

public class Ex7_2 {
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

//		int m=0;
//		
//		if(a>b){
//		if(a>b){
//			m=b;
//		}else{
//			m=a;
//		}
//		}else if(b>c){
//		
//		if(b>c){
//			m=c;
//		}else{
//			m=b;
//		}
//		}else{
//		
//		if(c>a){
//			m=a;
//		}else{
//			m=c;
//		}
//		}
//		
//		return m;
		
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	
		System.out.print("®”a:");
		int a=scanner.nextInt();
		System.out.print("®”b:");
		int b=scanner.nextInt();
		System.out.print("®”c:");
		int c=scanner.nextInt();
		
		int mi=min(a,b,c);
		
		System.out.println("\n"+"Å¬’l‚Í"+mi+"‚Å‚·B");
		
		scanner.close();
	}

}
