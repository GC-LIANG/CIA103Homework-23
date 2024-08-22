package hw1;

//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

public class Q6 {
  public static void main(String [] args) {
	  int num1 = 5;
	  char num2 = '5';
	  String num3 = "5";
	  
	  System.out.println(num1 + num1); //為兩個整數相加
	  System.out.println(num1 + num2); // '5'為字元 在Unicode中值為53 5+53=58
	  System.out.println(num1 + num3); // "5"為字串 55為兩個分開的數字 5是不同的型別
  }
}
