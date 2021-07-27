package Term_3;

import java.util.Scanner;

		public class Ex3_21 {

			public static void main(String[] args) {
				// TODO 自動生成されたメソッド・スタブ
				Scanner scanner=new Scanner(System.in);

				System.out.print("何月ですか:");
				int a=scanner.nextInt();

				switch(a){
				case 1:
				case 2:
				case 12:System.out.print("冬");
				break;

				case 3:
				case 4:
				case 5:System.out.println("春");
				break;


				case 6:
				case 7:
				case 8:System.out.println("夏");
				break;

				case 9:
				case 10:
				case 11:System.out.println("秋");
				break;

				default:System.out.println("そんな月はありません。");
				}
				scanner.close();
			}

		}
