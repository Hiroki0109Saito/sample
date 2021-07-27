package Term_5;

public class Ex5_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double a=0;
		
		System.out.println("x     xの二乗");
		System.out.println("----------------------");
		
		for(int i=0;i<1001;i++){
			System.out.printf("%.3f" +" "+"%.7f%n",a,a*a);
			a+=0.001;
		}
	}

}
