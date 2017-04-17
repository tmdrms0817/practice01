package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.print("문자열을 입력해 주세요 >");
		Scanner s = new Scanner(System.in);
		String lang = s.nextLine();
		String full = "";
		for (int i = 0; i < lang.length(); i++) {
			full+=lang.charAt(i); 
			System.out.println(full);
		}
	}
}