package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_15 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		String []moon=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String str="";
		System.out.println("�p��̌�������͂��Ă��������B");
		System.out.println("�Ȃ��A�擪�͑啶����2�����ڈȍ~�͏������Ƃ��܂��B");

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
				System.out.print(a+"��:");
				str=scanner.next();
				if(str.equals(moon[a-1])){
					System.out.print("�����ł��B");
					System.out.print("������x? 1�cYes/0�cNo:");
					b=scanner.nextInt();
					break;
				}else{
					System.out.println("�Ⴂ�܂��B");
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
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("January")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}
//				}while(b==0);
//				}else if(a==2){
//					do{
//						System.out.print(a+"��:");
//						str=scanner.next();
//						if(str.equals("February")){
//							System.out.print("�����ł��B");
//							System.out.print("������x? 1�cYes/0�cNo:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("�Ⴂ�܂��B");
//						}
//					}while(b==0);
//				}else if(a==3){
//					do{
//						System.out.print(a+"��:");
//						str=scanner.next();
//						if(str.equals("March")){
//							System.out.print("�����ł��B");
//							System.out.print("������x? 1�cYes/0�cNo:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("�Ⴂ�܂��B");
//						}
//					}while(b==0);
//				}
//				else if(a==4){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("April")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}
//				}while(b==0);
//				}
//				else if(a==5){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("May")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==6){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("Jun")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==7){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("July")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==8){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("August")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==9){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("September")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==10){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("October")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}
//				else if(a==11){do{
//					System.out.print(a+"��:");
//					str=scanner.next();
//					if(str.equals("November")){
//						System.out.print("�����ł��B");
//						System.out.print("������x? 1�cYes/0�cNo:");
//						b=scanner.nextInt();
//					}else{
//						System.out.println("�Ⴂ�܂��B");
//					}}while(b==0);
//				}else if(a==12){
//					System.out.print(a+"��:");
//					str=scanner.next();
//					do{
//						if(str.equals("December")){
//							System.out.print("�����ł��B");
//							System.out.print("������x? 1�cYes/0�cNo:");
//							b=scanner.nextInt();
//						}else{
//							System.out.println("�Ⴂ�܂��B");
//						}
//					}while(b==0);
//				}
//		}while(b==1);
//			scanner.close();
//
//
//	}
//}
