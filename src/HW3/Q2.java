package HW3;

// 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
// 對則顯示正確訊息,如圖示結果:

import java.util.Scanner;


public class Q2 {
	public static void main(String [] args) {
		int r = (int)(Math.random() * 10); //強制轉型 呼叫方法 乘上個數數量 再加上最小值
		System.out.println("開始猜數字：");
		Scanner sc = new Scanner(System.in);
		int g = -1;
		
		while(g != r) {
			g = sc.nextInt();
			if (g <0 || g>9) {
				System.out.println("請輸入 0 到 9 之間的數字！");
			}
			else if (g != r) {
				System.out.println("猜錯囉！");
			}
			else {
				System.out.println("猜對囉！答案就是" + g);
				break;
			}
				
			}
		sc.close();
		
		}
		
	}

	
