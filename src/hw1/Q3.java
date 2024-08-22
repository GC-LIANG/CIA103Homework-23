package hw1;

//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
// 一天86400秒
public class Q3 {
  public static void main(String [] args) {
	  int D = 256559 / 86400;
	  int H = (256559 - D* 86400) / 3600;
	  int M = (256559 - D* 86400 - H* 3600) / 60;
	  int S = 256559 - D* 86400 - H* 3600 - M* 60;
	  
	  System.out.println(D + "天" + H + "小時" + M + "分" + S + "秒");
  }
}
