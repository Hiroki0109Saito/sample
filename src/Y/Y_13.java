package Y;

import java.util.Scanner;

public class Y_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);

		String str="qdq-gi.q-a ziatmxxitmdqib"
				+ "tqi-ustbi ri.qmoqrcxi.qbubu "
				+ "zir -ibtqi-qp-qaai ripmymsqki"
				+ "r -ibtqi-qy dmxi ri.cnxuoi rr"
				+ "uoumxakir -ibtqiqzmobyqzbkii-q."
				+ "qmxi -imyqzpyqzbi rixmeaki -puz"
				+ "mzoqai -i-qscxmbu zaimzpir -i bt"
				+ "q-iymbbq-a;iz -iatmxximzgi.q-a "
				+ "zinqiuzimzgiemgipuao-uyuzmbqpims"
				+ "muzabir -ia. za -uzsiacotiimi.qbubu zj";

		char m[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' , ' ' , '.' , ',' , '-'} ;//30文字

		System.out.println("答えは12だけどどーする？");
		System.out.print("key(1~30):");
		int key=scanner.nextInt();

		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c==';'){
				System.out.print(';');
			}else{
				for(int j=0;j<m.length;j++){
					int r=0;

					if(c==m[j]){
						r=j;

						if((r-key)<0){
							r+=30;
						}
						System.out.print(m[r-key]);
					}
				}
			}

		}
		scanner.close();
	}
}
//			c=(char)((int)c-key);
//			c=(char) ('a'+after);