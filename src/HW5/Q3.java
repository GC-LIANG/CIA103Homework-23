package HW5;

public class Q3 {
	public static int maxElement(int x[][]) {
		int max = x[0][0];
		
		for(int i = 0; i < x.length; i++) {
			for(int j =0; j< x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		System.out.println(max);
		return max;

		
	}
	
	public static double maxElement(double x[][]) { //方法overloading
		double max = x[0][0];
		
		for(int i = 0; i<x.length; i++) {
			for(int j = 0; j< x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
				
		System.out.println(max);		
		return 0;
	}
	
	public static void main(String [] args) {
		int[][] t1 = { {1, 6, 3} , {9, 5, 2} };
		maxElement(t1);
		
		double[][] t2 = { {1.2, 3.2, 5.5}, {1.9, 8.9, 6.4} };
		maxElement(t2);
	}

}
