package hw1;

//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)

public class Q5 {
  public static void main(String [] args) {
	  final double rate = 1.02;
	  double Money = 1500000;
	  int year = 10;
	  
	  for(int i =1; i<= year; i++) {
		  Money = Money * rate;
	  }
	  
	  int finalMoney = (int)Money; //取整數
	  
	  double num1 = Money - finalMoney ; //陽春版四捨五入
	  if(num1 >= 0.5) {
		  finalMoney = finalMoney + 1;
	  }
	  System.out.println(finalMoney + "元");
	  
	
  }
}
