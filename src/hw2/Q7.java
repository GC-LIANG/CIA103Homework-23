package hw2;
//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class Q7 {
	public static void main(String [] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
//				System.out.print(j+ "\t");
				if(i == 1) {
					System.out.print('A');}
				if (i == 2) {
					System.out.print('B');}
				if (i == 3) {
					System.out.print('C');}
				if (i == 4) {
					System.out.print('D');}
				if (i == 5) {
					System.out.print('E');}
				if (i == 6) {
					System.out.print('F');}
				
				}
			System.out.println();
			}

		}
}

