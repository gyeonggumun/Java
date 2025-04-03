package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 숫자를 계속 입력받아 입력받은 숫자들의 총 합을 구하세요
		 * 0을 입력하면 "프로그램 종료" 라는 메시지를 띄우고
		 * 프로그램을 중지시키면 됨!!
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; ; i++) {
			System.out.println("입력 >>");
			int num1 = sc.nextInt();
			sum = num1 + sum;
			if (num1 == 0) {
				System.out.println("프로그램 종료");
				System.out.println(sum);
				break;
			}
		}
		
			
		}
		
	}

