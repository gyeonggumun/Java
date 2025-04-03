package exam;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 1부터 입력 받은 수 까지의 합계를 구하세요
		 * 
		 * 예를 들어 100을 입력받았다면
		 * 답 ) 5050
		 * 
		 * 10을 입력받았다면
		 * 답 ) 55
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num1; i++) {
			sum = sum + i;
		}
		System.out.println("답) " + sum);
		
		
		
		
	}
}
