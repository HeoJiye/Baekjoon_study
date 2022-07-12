package stage06;

import java.util.Scanner;

public class baekjoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int n = filpN(N);
		int m = filpN(M);
		
		System.out.println(n > m ? n : m);
	}
	
	static int filpN(int N) {
		int n = 0;
		while(N > 0) {
			n *= 10;
			n += N % 10;
			N /= 10;
		}
		return n;
	}
}
