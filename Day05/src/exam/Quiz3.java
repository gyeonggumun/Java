package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 자신의 몸묵게와 키를 입력받고
		 * BMI가 저체중인지, 정상인지, 과체중인지, 비만인지
		 * 판별하는 프로그램을 작성하세요
		 * 
		 * BMI가 18.5 아래면 저체중
		 * BMI가 18.5 ~ 22.9 사이면 정상
		 * BMI가 23.0 ~ 24.9 사이면 과체중
		 * BMI가 25.0 이상부터는 비만
		 * BMI 공식) 몸무게(KG) / (신장 (m)  * 신장(M))
		 * 
		 * 몸무게와 키는 실수타입으로 입력받도록 하고
		 * cm => m 변환하는법
		 * 1cm = (1/100)
		 * 872.5cm => 872.5 / 100 = 8.725
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요 >>");
		double m = sc.nextDouble();
		System.out.println("몸무게를 입력하세요 >>");
		double KG = sc.nextDouble();
		
		double BMI = KG / ((m/100)*(m/100));
		System.out.printf("%.2f\n", BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if (18.5< BMI && BMI< 22.9) {
			System.out.println("정상");
		}else if (23.0 < BMI && BMI < 24.9) {
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
	}
}
