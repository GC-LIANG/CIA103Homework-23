package HW5;

import java.util.Scanner;
 
public class Q1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬和高：");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
	}
	
	public static void starSquare(int width, int heigt) {
		for(int i =1; i<= heigt; i++) {
			for(int j =1; j<= width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
