package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int score[] = null;
			while (true) {
				System.out.println("-------------------------------------------");
				System.out.println("|1.학생 수|2.정수 입력 |3.점수 확인|4.분석| 5.종료|");
				System.out.println("-------------------------------------------");
				System.out.println(">>");
				int menu = sc.nextInt();
					if (menu == 1){
						System.out.println("학생수 >>");
						int num = sc.nextInt();
						score = new int[num];
					}else if (menu == 2) {
						System.out.println("[ 학생들의 점수 입력 ]");
						for (int j = 0; j < score.length; j++) {
							System.out.println(j+1 + ")번 학생 점수 :");
							score[j] = sc.nextInt();
						}
					}else if (menu == 3) {
						System.out.println("[ 학생들의 점수 확인 ]");
						for (int i = 0; i < score.length; i++) {
							System.out.println(i+1 + ")번 학생 점수 : ");
							System.out.println(score[i]);
						}
					}else if (menu == 4) {
						int sum = 0;
						int max = 0; //최고 점수
						int min = 0; //최저 점수
						System.out.println("[ 학생들의 점수 분석 ]");
						for (int k = 0; k < score.length; k++) {
							sum = sum + score[k];
							if (max < score[k]) {
								max = score[k]; //max 변수에 요소에 있는 값을 저장
							}  
							
							if (min==0 || min > score[k]) {
								min = score[k];
							} 
						}
						System.out.println("최고 점수 :" + max);
						System.out.println("최소 점수 :" + min);
						System.out.println("평균 점수 :" + (double)(sum/(score.length)));
					} else if (menu == 5) {
						System.out.println("종료되었습니다.");
						break;
					}
					
			
		

			
		
		}
	}
}

