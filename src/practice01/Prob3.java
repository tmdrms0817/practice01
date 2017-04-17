package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요 >");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int h_total = 0;
		int s_total = 0;
		boolean t_n = true;

		if (a % 2 > 0) { // 홀수
			t_n = false;
		}

		for (int i = 0; i <= a; i++) {

			if (i % 2 != 0) {
				h_total = h_total + i;
			} else {
				s_total = s_total + i;
			}
		}

		if (t_n) {
			System.out.println("짝수 total=" + s_total);
		} else {
			System.out.println("홀수 total=" + h_total);
		}

	}
}
