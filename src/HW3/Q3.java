package HW3;

// 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
// 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
// 的號碼與總數,如圖:

import java.util.Scanner;

public class Q3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文...請輸入你討厭哪個數字(1-9)：");
		int dislike = sc.nextInt();
		if (dislike <1 || dislike > 9) {
			System.out.println("請輸入1-9的數字！");
            sc.close();
            return;
		}
		
		int num = 1;
		int count = 0;
		int[][] lotto = new int[7][7];
		
		for(int i =0; i<lotto.length; i++) {
			for(int j =0; j < lotto[i].length; j++) {
				
				while(num % 10 ==dislike || num/10 ==dislike) {
					num++; }  //跳過
				
				if  (num <= 49) {
					lotto[i][j] = num;
					num++;
					count++;
				}
				else { 
					lotto[i][j] = 0;
				} // 若數字超過49 填0表空
				} 
		}// for結束
		
		System.out.println("可選擇的數字有：");
		for(int i1 =0; i1<lotto.length; i1++) {
			for(int j =0; j < lotto[i1].length; j++) {
				if(lotto[i1][j] != 0) {
					System.out.print(lotto[i1][j] + "\t");
				}

			}
			System.out.println();
			
			}
		
	
        System.out.println("總共有 " + count + " 個號碼可以選擇。");
        
        sc.close();
	}
}
