package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 숫자 한개를 입력받아 입력받은 수만큼
		 * 배열 크기를 지정하여
		 * 3의 배수를 저장하는 배열을 만들고 출력하세요
		 * 
		 * 출력 예시)
		 * 5를 입력받으면
		 * 3 6 9 12 15
		 * 
		 * 9를 입력받으면
		 * 3 6 9 12 15 18 21 24 27
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 3;	
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
