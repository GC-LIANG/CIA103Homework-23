package HW5;

import java.util.Random;

public class Q5 {
	public static String genAuthCode() {
		char[] base = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
		};
		char[] code = new char[8];
		for(int i = 0; i<8; i++) {
			int a = (int)(Math.random()* base.length);
			code[i] = base[a];
		}
		
		String authCode = new String(code);
		System.out.print("隨機生成的驗證碼：" + authCode);

		return authCode;
		
	}
	
	public static void main(String [] args) {
		genAuthCode();
	}

}
