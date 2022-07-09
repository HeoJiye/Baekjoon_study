package stage06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon11720 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		String arr = sc.next();
//		
//		int sum = 0;
//		for(int i = 0; i < num; i++) {
//			sum += arr.charAt(i) - '0';
//		}
//		System.out.println(sum);
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0; i < sum; i++) {
			sum += br.read() - '0';
		}

		System.out.println(sum);
	}

}
