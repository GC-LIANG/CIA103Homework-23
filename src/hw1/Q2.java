package hw1;

//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)


public class Q2 {
	public static void main(String [] args) {
		int egg= 200;
		int dozen = egg/12;
		int last = egg - 12* dozen;
		String s1 = "打";
	    String s2 = "顆";
		
		System.out.println(dozen + s1 + last + s2 );
	}

}
