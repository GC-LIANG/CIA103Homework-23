package HW5;

import java.util.Scanner;

public class MyRectangleTest {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		MyRectangle r = new MyRectangle();
		System.out.println("請輸入寬度：");
		double width = sc.nextDouble();
		r.setWidth(width);
		System.out.println("請輸入深度：");
		double depth = sc.nextDouble();
		r.setDepth(depth);
		r.getArea();
		
		
	}

}
