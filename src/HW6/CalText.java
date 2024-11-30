package HW6;

import java.util.Scanner;

public class CalText {
	public static void main(String [] args) {
		loopFC();

	}
	
	public static void loopFC() {
		
		try {
			System.out.println("請輸入x的值：");
			int x = Calculator.getInt();
			System.out.println("請輸入y的值：");
			int y = Calculator.getInt();
			int z = Calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方為" + z);
		} catch(CalException ce) {
			System.out.println(ce.getMessage());
			loopFC();
		}
		
		
		
	}


}
