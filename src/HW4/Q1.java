package HW4;

public class Q1 {
	public static void main(String [] args) {
		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int a = 0;
		for(int i : x) { // 把陣列所有元素都跑一遍
			a = a+ i;
		}
		for (int i:x) {
			if(i> a/x.length) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("\n"+a/x.length); // avg
		
	}

}
