package HW4;

public class Q6 {
	public static void main(String [] args) {
		int[][] scores = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 70, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 90, 75} };
		int [] counts = new int[8]; //8位學生
		
		for (int i =0; i< scores.length; i++) {
			int max = 0;

			for (int j =0; j <scores[i].length; j++) {
				if(scores[i][j] >max) {
					max = scores[i][j];
				
				}
			}
			for(int j = 0; j < scores[i].length; j++) {
				if(scores[i][j] == max) {
					counts[j]++;
				}
			}
//			System.out.println(max);
         }
		for (int i = 0; i< counts.length; i++) {
			System.out.println("學生" + (i+1) + "號獲得最高分的次數為" + counts[i] + "次！");
		}
	
		}
	}


