package Term_6;

import java.util.Scanner;

public class Ex6_21 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner=new Scanner(System.in);

		System.out.print("�N���X��:");
		int a=scanner.nextInt();

		int []c=new int [a];
		double []ave=new double[a];
		int sum=0;
		int y=0;

		for(int i=0;i<a;i++){
			System.out.print((i+1)+"�g�̐l��:");
			int b=scanner.nextInt();
			for(int j=0;j<b;j++){
				System.out.print((i+1)+"�g"+(j+1)+"�Ԃ̓_��:");
				c[i]+=scanner.nextInt();
				y++;
			}
			System.out.println();
			ave[i]=((double)c[i])/b;
			sum+=c[i];
		}

		System.out.println(" �g|  ���v ����");
		System.out.println("-----------------");
		for(int i=0;i<a;i++){
			System.out.printf((i+1)+"�g|  "+c[i]+"  "+"%.1f%n",ave[i]);
		}
		System.out.println("-----------------");
		System.out.printf("�v |  "+sum+"  %.1f%n",((double)sum)/y);

		scanner.close();
	}
}