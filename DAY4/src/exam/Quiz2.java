package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아 3의 배수이면 3의 배수입니다
		 * 아니면 3의 배수가 아닙니다를 출력하세요!!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int num = sc.nextInt();
		int result = num % 3;
		if (result == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		
	}
}
