package Term_6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_16 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		String []eng=new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String []jap=new String[]{"��","��","��","��","��","��","�y"};

		String str="";
		System.out.println("�p��̗j�������������œ��͂��Ă��������B");

		int b=1;
		int t=0;
		int a=0;
		int s=1;

		do{
			do{
				t=rand.nextInt(7);
			}while(a==t);

			a=t;
			do{
				System.out.print(jap[a]+"�j��:");
				str=scanner.next();
				if(str.equals(eng[a])){
					System.out.print("�����ł��B");
					System.out.print("������x? 1�cYes/0�cNo:");
					b=scanner.nextInt();
					break;
				}else{
					System.out.print("�Ⴂ�܂��B�ǂ����܂���?1�c�ē���/0�c����������");
					s=scanner.nextInt();
					if(s==0){
						System.out.println(jap[a]+"��"+eng[a]+"�ł��B");
						System.out.print("������x? 1�cYes/0�cNo:");
						b=scanner.nextInt();
					}
				}
			}while(s==1);
		}while(b==1);
		scanner.close();
	}
}
