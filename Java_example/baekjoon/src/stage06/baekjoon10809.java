package stage06;

import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < 26; i++)
			arr[i] = -1;
		
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i) - 'a'] == -1)
				arr[str.charAt(i) - 'a'] = i;
		}
		
		
		for(int i = 0; i < 26; i++)
			System.out.print(arr[i] + " ");

	}

}
