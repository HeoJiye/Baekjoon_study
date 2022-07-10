package stage06;

import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int num = 0;
		
		boolean flag = false;
		for(int i = 0; i < S.length(); i++) {
			if(flag && S.charAt(i) == ' ') {
				flag = false;
				num++;
			}
			else if(!flag && S.charAt(i) != ' ') {
				flag = true;
			}
		}
		if(flag) num++;
		
		System.out.println(num);
	}
}
