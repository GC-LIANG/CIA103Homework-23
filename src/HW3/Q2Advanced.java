package HW3;



import java.util.Scanner;


public class Q2Advanced {
	public static void main(String [] args) {
		int r = (int)(Math.random() * 101); //強制轉型 呼叫方法 乘上個數數量 再加上最小值
		System.out.println("開始猜數字：");
		Scanner sc = new Scanner(System.in);
		int g = -1;
		
		while(g != r) {
			g = sc.nextInt();
			if (g <0 || g>100) {
				System.out.println("請輸入 0 到 9 之間的數字！");
			}
			else if (g < r) {
				System.out.println("猜錯囉！再猜大一點");
			}
			else if (g > r) {
				System.out.println("猜錯囉！再猜小一點");
			}
			else {
				System.out.println("猜對囉！答案就是" + g);
				break;
			}
				
			}
		sc.close();
		
		}
		
	}

	
