package shukudai;

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
			if((companyName[i]).contains("株式会社")) {
				System.out.println(companyName[i] +"御中");
			}else {
				if((companyName[i]).contains("合同会社")) {
					System.out.println(companyName[i] +"御中");
				}else{
					if((companyName[i]).contains("有限会社")) {
					System.out.println(companyName[i] +"御中");
				}else {
				System.out.println(companyName[i] + "様");
				
			}
		}
	}
		
	}
		
		String[]companyNameSecond= {
				"合資会社ダイリン",
				"株式会社グローイング",
				"合資会社上田建材店" ,
				"山口 昂" ,
				"藤原 俊和", 
				"前田 良平" ,
				"柳 達也",
				"有限会社栄進",
				"株式会社サンクリエイト",
				"西谷 昇",
				"山田 剛"};
		for(int i=0; i<companyNameSecond.length; i++) {
			if((companyNameSecond[i]).contains("株式会社")) {
				System.out.println(companyNameSecond[i] +"御中");
			}else {
				if((companyNameSecond[i]).contains("合同会社")) {
					System.out.println(companyNameSecond[i] +"御中");
				}else{
					if((companyNameSecond[i]).contains("有限会社")) {
					System.out.println(companyNameSecond[i] +"御中");
				}else {
				System.out.println(companyNameSecond[i] + "様");
				
			}
		}
	}
		
	}
	
	}}
		
	
					

	
	


