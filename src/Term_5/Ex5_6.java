package Term_5;

import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("�����l��x��y��z�̕��ϒl�����߂܂��B");
		System.out.print("x�̒l:");
		int x=scanner.nextInt();
		System.out.print("y�̒l:");
		int y=scanner.nextInt();
		System.out.print("z�̒l:");
		int z=scanner.nextInt();

		System.out.println("x��y��z�̒l�̍��v�l��"+(x+y+z)+"�ł��B");

		int sum=x+y+z;
		double ave=(double)sum/3;

		System.out.printf("x��y��z�̕��ϒl��"+"%.3f"+"�ł��B"+"\n",ave);
		//System.out.printf("x��y��z�̕��ϒl��"+(x+y+z)/3+"�ł��B"+"\n");
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		scanner.close();

	}

}
