package Term_5;

public class Ex5_9 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		double a=0;
		
		System.out.println("x     x�̓��");
		System.out.println("----------------------");
		
		for(int i=0;i<1001;i++){
			System.out.printf("%.3f" +" "+"%.7f%n",a,a*a);
			a+=0.001;
		}
	}

}
