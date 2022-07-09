package stage09;

import java.util.Scanner;

public class baekjoon2447 {
	static char[][] star;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		star = new char[num][num];
		
		init(num);
		set_star(num, num, num);
		print_star(num);
	}
	
	static void init(int N) {
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				star[i][j] = ' ';
	}
	
	static void set_star(int N, int x, int y) {
		if(N == 1) 
			star[x-1][y-1] = '*';
		else {
			N /= 3;
			x -= 2*N; y -=  2*N;
			for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				if(i != 1 || j != 1) // center »©°í
					set_star(N, x+N*i, y+N*j);
		}
		
	}
	
	static void print_star(int N) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
