package quiz;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	
	public Phone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void user1(String name, String tel) {
		System.out.println(name + tel);
	}
	
}
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] phone = null;
		while(true) {
			System.out.println("1.입력 | 2. 검색 | 3. 프로그램종료 ");
			System.out.println("메뉴를 선택해주세요 >>");
			int num1 = sc.nextInt();
			if (num1 == 1) {
				System.out.println("인원수 >>");
				int num = sc.nextInt();
				phone = new Phone[num];
				for (int i = 0; i < phone.length; i++) {
					System.out.println("이름과 전화번호 입력 >>");
					String name = sc.next();
					String tel = sc.next();
					phone[i] = new Phone(name, tel);
				}
			}else if(num1 == 2) {
				System.out.println("검색할 이름 >>");
				String search_name = sc.next();
				boolean flag = false;
				for(int i = 0; i < phone.length; i++) {
					if(phone[i].getName().equals(search_name)) {
						System.out.println(search_name + "의 번호는" + phone[i].getTel() + "입니다");
						flag = true;
					}
				}
				if(!flag) {
					System.out.println(search_name + "이름은 없습니다.");
				}
			}else if(num1 == 3) {
				System.out.println("종료");
				break;
			}
		}
	}
}
