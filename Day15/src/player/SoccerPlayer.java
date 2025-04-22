package player;

public class SoccerPlayer extends Player {
	int goalNum;
	/*
	 * super()
	 * - 매개 값의 개수와 타입이 일치하는 부모 생성자를 호출한다
	 * - 만약 매개 값의 개수와 타입이 일치하는 부모 생성자가 없을 경우
	 * 커파일 에러가 발생
	 * - 매개 값이 없는 경우 부모의 기본 생성자를 커파일러가 자동으로
	 * 만들기 때문에 생략해도 됨 !!
	 * 
	 */
	
	public SoccerPlayer(String name, int age, int goalNum) {
		super(name, age);
		this.goalNum = goalNum;
	}

}
