package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		int cash = 0;
		while(true) {
		System.out.println("---------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔금 |4.종료");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴입력 >>");
		int num1 = sc.nextInt();
		if (num1 == 1) {
			System.out.print("예금액 :");
			int plus = sc.nextInt();
			cash = cash + plus;
		}else if (num1 == 2) {
			System.out.print("출금액 :");
			int min = sc.nextInt();
			if (cash > min) {
				System.out.println("잔액이 부족합니다.");
			} else{
				cash = cash - min;
			}
		}else if (num1 == 3) {
			System.out.println("잔고" + cash);
		}else if (num1 == 4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
			
		}
	}
}
