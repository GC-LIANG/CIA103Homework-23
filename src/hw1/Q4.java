package hw1;

//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class Q4 {
  public static void main(String [] args) {
	  
	 double PI = 3.1415 ;
	 double radius = 5;
	 double area = PI * radius * radius;
	 double perimeter = PI * radius * 2;
	 
	 System.out.println("圓面積為："+ area);
	 System.out.println("圓周長為："+ perimeter);
  }
}
