package May;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Day5_6_1 {

	public static void main(String[] args) {

		Path path=Paths.get("addres.txt");

		try(BufferedReader in=Files.newBufferedReader(path)){
			try{
				FileOutputStream fileOut= new FileOutputStream("C:\\Users\\hiroki_saito\\Desktop\\saito\\import_address.xls");

				String line;

				wb.setSheetName(0,"sheet1");

				HSSFWorkbook wb = new HSSFWorkbook();
				HSSFSheet sheet1 = wb.createSheet();
				HSSFRow row = sheet1.createRow(0);
				HSSFCell cellA1 = row.createCell(0);


				while((line=in.readLine())!=null){
					String str[]=line.split(",");
					int i=0;

					System.out.println(str[i]);

					while(str[i]!=null){
						cellA1.setCellValue(str[i]);
						i++;
					}







				}
				//新規ワークブックを作成する

//				wb.setSheetName(0,"sheet1");
//
//				HSSFRow row = sheet1.createRow(0);
//				HSSFRow row1 = sheet1.createRow(0);
//				HSSFRow row2 = sheet1.createRow(0);
//				//					for(int i=0;i<3;i++){
//
//				HSSFCell cellA1 = row.createCell((short)1);
//				HSSFCell cellA2 = row.createCell((short)1);
//
//				cellA1.setCellValue(line);
//
//				cellA2.setCellValue("abcde");
//				//作成したワークブックを保存する
				//				}
				wb.write(fileOut);
				fileOut.close();
				System.out.println("Excelファイルの作成が完了しました！");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("処理が失敗しました");
			}
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
