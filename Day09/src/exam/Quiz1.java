package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		int computer = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true){
			count++;
			System.out.print("1~100 숫자 입력 : ");
			int user = sc.nextInt();
			if (computer > user) {
				System.out.println("UP");
			} else if (computer < user) {
				System.out.println("DOWN");
			} else if (computer == user) {
				System.out.println("정답입니다!"+ count +"회 만에 맞췄어요");
				break;
			}
		}
	}
}
