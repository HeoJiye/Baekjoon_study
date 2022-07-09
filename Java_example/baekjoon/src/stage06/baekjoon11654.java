package stage06;

import java.util.Scanner;

public class baekjoon11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		//System.out.println((int)ch);
		System.out.println(toAsciiCode(ch));
	}
	
	static int toAsciiCode(char c) {
		return c;
	}
}
