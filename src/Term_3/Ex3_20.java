package Term_3;

import java.util.Random;


public class Ex3_20 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Random rand=new Random();

		System.out.print("����:");
		int b=rand.nextInt(3);
		System.out.println(b);

		switch (b) {
		case 0 : System.out.println("�R���s���[�^������������:�O�[");
		break;
		case 1 : System.out.println("�R���s���[�^������������:�`���L");
		break;
		case 2 : System.out.println("�R���s���[�^������������:�p�[");
		break;
		}
	}

}
