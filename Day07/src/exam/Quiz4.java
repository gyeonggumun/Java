package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아
		 * 그 수의 구구단을 출력하세요
		 * 
		 * 입력 >> 5
		 * 출력)
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * 5 x 3 = 15
		 * ...
		 * 5 x 9 = 45
		 * 
		 * 입력 >> 7
		 * 7 x 1 = 7
		 * 7 x 2 = 14
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int num1 = sc.nextInt();
		int e = 0;
		for (int i =1; i <= 9; i++) {
			e = num1 * i;
			System.out.printf("%d x %d = %d\n ",num1, i, e);
			
		}
		
	}
}
