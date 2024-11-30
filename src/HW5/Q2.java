package HW5;

public class Q2 {
	public static void randAvg() {
		int[] random = new int[10];
		int sum = 0;
		
		for(int i =0; i<10; i++) {
			int a = (int)(Math.random() *101);
			random[i] = a;
			sum += random[i]; 
			System.out.println("第" + (i+1) + "個隨機值為：" + random[i] );
		}
		double avg = (double) sum / random.length;
		System.out.println("平均值為：" + avg);
	}
	
	public static void main(String [] args) {
		randAvg();
		
	}

}
