package quiz;

import java.util.Scanner;

class Cal {
	public int calculate(int num1, int num2, char opt) {
		int result = 0;
		switch(opt) {
		case '+' :
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		return result;
	}
}
	


public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char opt = sc.next().charAt(0);
		Cal cal = new Cal();
		System.out.println(cal.calculate(num1,num2,opt));
	}
}
