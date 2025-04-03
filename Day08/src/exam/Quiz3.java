package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * Math.random() 메소드를 이용해서 두 개의 주사위를
		 * 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고
		 * 눈의 합이 오가 아니면 계속 주사위를 던지고
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성하세요
		 * 멈추기 전까지의 눈의 형태는 전부 출력되어야 한다!!
		 */
		
		for (int i = 1; ;i++) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d , %d)\n", dice1, dice2);
			if (dice1 + dice2 == 5) {
				System.out.println("합이 5이므로 종료");
				break;
			}
		}
		
	}
}
