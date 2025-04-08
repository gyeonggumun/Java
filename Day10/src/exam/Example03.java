package exam;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		// 입력받은 값을 배열에 저장
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		//루프를 돌면서 각 인덱스에 접근하여 해당 데이터를 입력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
