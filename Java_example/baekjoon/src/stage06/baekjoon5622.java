package stage06;

import java.util.Scanner;

public class baekjoon5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int sec = 0;
		for(int i = 0; i < S.length(); i++) 
			sec += 2 + chToInt(S.charAt(i)) - 1;
		System.out.println(sec);
	}
	
	static int chToInt(char ch) {
		ch -= 'A'; // 1 2 3 4 5 6 7 
		if(ch/3 <= 5) return ch/3 + 2;
		else {
			ch -= 15;
			if(ch < 4) return 7;
			else if(ch < 7) return 8;
			else return 9;
		}
	}
}
