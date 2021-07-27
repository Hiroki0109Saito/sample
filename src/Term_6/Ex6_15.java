package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		String []moon=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String str="";
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で2文字目以降は小文字とします。");

		int b=1;
		int t=0;
		int a=1;

		do{
			do{
				t=rand.nextInt(12)+1;
			}while(a==t);

			//while(true){
			//if(a==t)
			//break;
			//}

			a=t;

			while(b!=0){
				System.out.print(a+"月:");
				str=scanner.next();
				if(str.equals(moon[a-1])){
					System.out.print("正解です。");
					System.out.print("もう一度? 1…Yes/0…No:");
					b=scanner.nextInt();
					break;
				}else{
					System.out.println("違います。");
				}
			}
		}while(b==1);

		scanner.close();
	}
}

//		int a=0;
//		int b=0;
//		int c=0;
//
//		do{
//			b=0;
//			do{
//				c=rand.nextInt(12)+1;
//			}while(a==c);
//			a=c;
//
//			String str="";
//
//			if(a==1){
//				do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("January")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}
//				}while(b==0);
//				}else if(a==2){
//					do{
//						System.out.print(a+"月:");
//						str=scanner.next();
//						if(str.equals("February")){
//							System.out.print("正解です。");
//							System.out.print("もう一度? 1…Yes/0…No:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("違います。");
//						}
//					}while(b==0);
//				}else if(a==3){
//					do{
//						System.out.print(a+"月:");
//						str=scanner.next();
//						if(str.equals("March")){
//							System.out.print("正解です。");
//							System.out.print("もう一度? 1…Yes/0…No:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("違います。");
//						}
//					}while(b==0);
//				}
//				else if(a==4){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("April")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}
//				}while(b==0);
//				}
//				else if(a==5){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("May")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==6){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("Jun")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==7){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("July")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==8){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("August")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==9){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("September")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==10){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("October")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}
//				else if(a==11){do{
//					System.out.print(a+"月:");
//					str=scanner.next();
//					if(str.equals("November")){
//						System.out.print("正解です。");
//						System.out.print("もう一度? 1…Yes/0…No:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("違います。");
//					}}while(b==0);
//				}else if(a==12){
//					System.out.print(a+"月:");
//					str=scanner.next();
//					do{
//						if(str.equals("December")){
//							System.out.print("正解です。");
//							System.out.print("もう一度? 1…Yes/0…No:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("違います。");
//						}
//					}while(b==0);
//				}
//		}while(b==1);
//			scanner.close();
//
//
//	}
//}
