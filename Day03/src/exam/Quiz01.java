package exam;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 자신의 나이, 이름, 학교, 거주지를 입력받아
		 * 출력하는 프로그램을 작성하세요
		 * 
		 * 출력결과)
		 * 저의 나이는 31살이고 이름은 윤준형, 학교는 코리아대학 이며, 부산시 수영구 광안동에 살고 있습니다
		 * 
		 * 출력결과는 콘솔창에 한줄로 출력하도록 !!!!!
		 */
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("나이를 입력하세요 >>");
		 int age = sc.nextInt();
		 
		 System.out.println("이름을 입력하세요 >>");
		 sc.nextLine();
		 String name = sc.nextLine();
		 
		 System.out.println("학교를 입력하세요 >>");
		 String school = sc.nextLine();
		 
		 System.out.println("지역을 입력하세요 >>");
		 String addr = sc.nextLine(); 
		
		 System.out.printf("저의 나이는 %d살이고 이름은 %s, 학교는 %s 이며, %s에 살고있습니다."
				 , age, name, school, addr);
		 
		 // sc.close();  닫는 명령어
	}
}
