package stage06;

import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j = 0; j < S.length(); j++) {
				for(int n = 0; n < R; n++)
					sb.append(S.charAt(j));
			}
			sb.append('\n');
		}
		
		System.out.print(sb);
		
		sc.close();
	}

}
