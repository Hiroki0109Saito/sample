package Term_3;

import java.util.Scanner;

		public class Ex3_21 {

			public static void main(String[] args) {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				Scanner scanner=new Scanner(System.in);

				System.out.print("�����ł���:");
				int a=scanner.nextInt();

				switch(a){
				case 1:
				case 2:
				case 12:System.out.print("�~");
				break;

				case 3:
				case 4:
				case 5:System.out.println("�t");
				break;


				case 6:
				case 7:
				case 8:System.out.println("��");
				break;

				case 9:
				case 10:
				case 11:System.out.println("�H");
				break;

				default:System.out.println("����Ȍ��͂���܂���B");
				}
				scanner.close();
			}

		}
