package stage09;

import java.util.Scanner;

public class baekjoon11729 {
	static StringBuilder sb;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sb = new StringBuilder();
		sb.append(hanoi_sum(num) + "\n");
		
		hanoi(num, 1, 2, 3);
		System.out.print(sb);
	}
	
	static void hanoi(int N, int start, int mid, int to) {
		if( N > 0 ) {
			hanoi(N-1, start, to, mid);
			sb.append(start + " " + to + "\n");
			hanoi(N-1, mid, start, to);
		}
	}
	
	static int hanoi_sum(int h) { // 높이가 h인 완전 이진 트리 노드의 개수
		int sum = 1;
		for(int i = 0; i < h; i++) sum *= 2;
		return sum - 1;
	}
	
}
