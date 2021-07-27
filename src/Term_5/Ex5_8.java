package Term_5;

public class Ex5_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		float a=0;
		int b=0;
		
		System.out.print("float     int"+"\n");
		System.out.println("----------------------");
		
		for(int i=0;i<1001;i++){
			System.out.printf("%.7f" +" "+"%.7f%n",a,(double)b/1000);
			a+=0.001;
			b+=1;
		}

	}

}
