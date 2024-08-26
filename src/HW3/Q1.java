package HW3;

import java.util.Scanner;

// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、
// 等腰三角形、其它三角形或不是三角形,如圖示結果:

public class Q1 {
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (isTriangle(a, b, c)) {
			if(a==b && b==c) {
			System.out.println("這是正三角形");
			}
			else if(a == b || b == c || a == c) {
			System.out.printf("這是等腰三角形");
			}
			else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {;
			System.out.printf("這是直角三角形");
		}
			else {
			System.out.println("這是一個三角形");
			}
		}
		else {
			System.out.println("這不是一個三角形");
		}
		sc.close();
		

		}
			
			
	    
	
	public static boolean isTriangle(int a, int b, int c) {
		if((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		else { return false;
		}
		
		}
	}

	



