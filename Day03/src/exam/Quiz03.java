package exam;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 * 10 ~ 99 사이 두자리 수를 입력받아
		 * 십의 자리와 일의 자리 숫자를 각각 출력하세요
		 * 
		 * 입력 >> 78
		 * 십의자리 : 7
		 * 일의자리 : 8
		 * 
		 * 입력 >> 46
		 * 십의자리 : 4
		 * 일의자리 : 6
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int num1 = sc.nextInt();
		System.out.println("십의자리 :" + num1 /10);
		System.out.println("일의자리 :"+ num1 % 10);
		
		
		
	}
}
