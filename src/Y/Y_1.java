package Y;

import java.util.Scanner;

public class Y_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		long start =System.currentTimeMillis();

		Scanner scanner=new Scanner(System.in);

		System.out.print("���l����͂��Ă�������:");
		int a=scanner.nextInt();


		for(int i=1;i<a+1;i++){
			int count=0;

			for(int j=1;j<i;j++){
				if(i%j==0){
				}else{	//i������؂�Ȃ�����count++
					count++;
				}

				if(i==(count+2)){	//i��count�������Ƃ�i�͑f��
					System.out.println(i);
				}

			}
		}

		long end=System.currentTimeMillis();

		System.out.println("�������Ԃ�"+(end-start)+"ms�ł��B");

		scanner.close();
	}
}
