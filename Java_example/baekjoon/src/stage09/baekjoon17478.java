package stage09;

import java.util.Scanner;

public class baekjoon17478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		repeat(num);
	}
	
	static void repeat(int n) {
		repeat_1(n-1);
		for(int i = 0; i < n*4; i++) System.out.print("_");
		System.out.println("\"재귀함수가 뭔가요?\"");
		for(int i = 0; i < n*4; i++) System.out.print("_");
		System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
		repeat_2(n);
	}
	
	static void repeat_1(int n) {
		if(n == 0) {
			System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
			
			System.out.println("\"재귀함수가 뭔가요?\"");
			System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		}
		else {
			repeat_1(n-1);
			
			for(int i = 0; i < n*4; i++) System.out.print("_");
			System.out.println("\"재귀함수가 뭔가요?\"");
			for(int i = 0; i < n*4; i++) System.out.print("_");
			System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
			for(int i = 0; i < n*4; i++) System.out.print("_");
			System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
			for(int i = 0; i < n*4; i++) System.out.print("_");
			System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		}
		
	}
	static void repeat_2(int n) {
		if(n == 0) {
			System.out.println("라고 답변하였지.");
		}
		else {
			for(int i = 0; i < n*4; i++) System.out.print("_");
			System.out.println("라고 답변하였지.");
			
			repeat_2(n-1);
		}
	}

}
