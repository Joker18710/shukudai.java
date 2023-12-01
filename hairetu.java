package shukudai;
import java.util.Arrays;
public class hairetu {
	public static void main(String[] args) {
		String[]companyName= {
				"有賀 明宏",
				"坂本 巧",
				"梅沢 大輔",
				"株式会社グリーンフィールド",
				"株式会社ABC",
				"株式会社幸",
				"玉城 純一",
				"篠田 功一郎",
				"橋本 理恵",
				"合同会社やってみよう",
				"株式会社ヒラタ"};
		for(int i=0; i<companyName.length; i++) {
			if(Arrays.asList(companyName[i]).contains("株式会社")) {
				System.out.println(companyName[i] +"御中");
			/*}else {
				if(Arrays.asList(companyName[i]).contains("合同会社")) {
					System.out.println(companyName[i] +"御中");
				}else{
					if(Arrays.asList(companyName[i]).contains("有限会社")) {
					System.out.println(companyName[i] +"御中");*/
				}else {
				System.out.println(companyName[i] + "様");
			}
		}
	}
		
	}

	
	


