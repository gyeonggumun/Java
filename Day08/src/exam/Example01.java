package exam;

public class Example01 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		int j = 1;
		while (j <= 10) {
			System.out.println("java" + j + "번");
			j++;
		}
	}
}
