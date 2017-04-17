package practice01;

public class Prob2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i++) {
			for (int j = 1+i; j <= i+10; j++) {
				System.out.print(j);
				if(i+9<j){
					System.out.print("\n");
				}
			}
		}
	}
}