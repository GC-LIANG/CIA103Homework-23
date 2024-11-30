package HW4;

import java.util.Scanner;

public class Q5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		
		System.out.println("請輸入年份：");
		int year = sc.nextInt();
		
		if(LeapYear(year)) {
			monthDays[1] = 29;
		}
		
		System.out.println("請輸入月份：");
		int month = sc.nextInt();
		if(month >12 || month < 1) {
			System.out.print("請輸入正確的月份！");
			return;
		}
		
		System.out.println("請輸入日：");
		int day = sc.nextInt();
	
		if (day < 1 || day > monthDays[month -1]) {
			System.out.print("請輸入正確的日期！");
			return;
		}
		
		int dayOfYear = 0;
		for(int i = 0; i<month; i++) {
			dayOfYear += monthDays[i] ; 
		}
		dayOfYear += day; 
		System.out.print("這是" + year +"年的第" + dayOfYear + "天！");
		
	}
	
	public static boolean LeapYear(int year) {
		return (year %4 ==0 && year %100 !=0) ||(year %400 == 0);
	}

}
