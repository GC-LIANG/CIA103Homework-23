package HW6;

import java.util.Scanner;

public class Calculator {

	public static int powerXY(int x, int y) throws CalException{
		if(x==0 && y==0) {
			throw new CalException("0的0次方沒有意義！");
		}
		if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}
		
		return (int) Math.pow(x, y);
	}
	
	public static int getInt() throws CalException {
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		}catch(Exception e) {
			throw new CalException("輸入格式不正確");

		}
	}

}
