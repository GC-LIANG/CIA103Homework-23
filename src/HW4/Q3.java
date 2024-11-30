package HW4;

public class Q3 {
	public static void main(String[] args) {
		String[] x = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int a=0;
		
		for(String str : x) {
			char[] y = str.toCharArray();
			
			for (char c : y) {
				if (c == 'a' || c== 'e' || c== 'i' || c== 'o' ||c== 'u') {
					a++;
				}
			}
		}
		System.out.println(a +"個");
		
	}
}
