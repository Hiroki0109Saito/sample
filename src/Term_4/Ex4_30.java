package Term_4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_30 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();

		System.out.println("�����ăQ�[���J�n!!"+"\n"+"0~99�̐��𓖂ĂĂ��������B");
		int a=rand.nextInt(100);
		int b=0;
		int g=6;

		//		System.out.println(a);

		while(a!=b&&0<g){
			System.out.print("�c��"+g+"��B"+"��������:");
			b=scanner.nextInt();

			if(g==1){
				g--;
				break;
			}
			if(a>b){
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}else if(a<b){
				System.out.println("�����Ə����Ȑ�����B");
			}
			g--;
		}

		if(a==b){
			System.out.println((6-g)+"��œ�����܂����ˁB");
		}else{
			System.out.println("�͂���I�I�I");
		}

		scanner.close();

	}

}
