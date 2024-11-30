package HW4;

import java.util.Scanner;

public class Q4 {
	public static void main(String [] args) {
		int[][] x = {{25,2500}, {32,800}, {8,500}, {19,1000}, {27,1200}};
		System.out.println("阿文...你要借多少錢？");
		Scanner sc = new Scanner(System.in);
		int wen = sc.nextInt();
		int count = 0;
		System.out.print("有錢可借的員工編號：");
		
		for(int[]y :x) {
			int id = y[0];
			int money = y[1];

			
			if(money >= wen) {
				System.out.print(id + " ");
//				System.out.println("金額：" + money);
				count++;
			}

		}
		System.out.print("共" + count + "人");

		
	}

}
