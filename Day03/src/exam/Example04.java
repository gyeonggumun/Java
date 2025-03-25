package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 *  자동 형 변환, 강제 형 변환
		 *  
		 *  자동 형 변환
		 *  - 크기가 작은 자료형에서 큰 자료형으로 변환할 때 
		 *  
		 *  강제 형 변환
		 *  - 큰 자료형에서 작은 자료형으로 이동할 때 오류가 발생하지 
		 *  않도록 강제적으로 형 변환을 해주는 것
		 *  - 데이터 손실이 발생 시 예상치 못한 결과가 나옴
		 */
		
		// 자동 타입 변환
		byte byteVar = 10;
		int intVar = byteVar;
		System.out.println(intVar);
		
		char charVar = '윤';
		int Var = charVar;
		System.out.println(charVar + "의 유니코드 ㅣ"+ intVar);
		
		//강제 타입 변환
		int intVar1 = 48149; // '박'의 유니코드 정수 값
		char charVar1 = (char) intVar1;
		System.out.println(charVar1);
		
		
	}
}
