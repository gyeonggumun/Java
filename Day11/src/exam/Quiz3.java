package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1번째 피보나치 수는 1이다
		 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n => 2)가 된다
		 * n=10 일때 까지 피보나치 수를 써보면 다음과 같다.
		 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		System.out.println(arr[0]+ "\n" + arr[1]);
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println(arr[i]);
		}
		System.out.println(arr[num-1]);
		
	}
}
