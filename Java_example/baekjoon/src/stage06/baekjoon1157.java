package stage06;

import java.util.Scanner;

public class baekjoon1157 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		char max_ch = '?'; int max_num = 0;
		
		char ch = 'A';
		while (ch <= 'Z') {
			int num = 0;
			for(int i = 0; i < S.length(); i++)
				if(ch == S.charAt(i) || ch + ('a'-'A') == S.charAt(i)) 
					num++;
			
			if(max_num < num) {
				max_ch = ch; 
				max_num = num;
			} 
			else if(max_num == num)
				max_ch = '?';
			
			ch += 1;
		}
		
		System.out.println(max_ch);
	}
}
