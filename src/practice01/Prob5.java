package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		String num= "";
		for (int i = 1; i < 100; i++) {
			num = Integer.toString(i);
			int b = num.length();
			String data = "";
			for(int c = 0; c < b; c++){
				char f = num.charAt(c);
				if((f=='3')||(f=='6')||(f=='9')){
					data+="짝";
				}
			}
			if(!data.equals("")){
				System.out.println(num+data);
			}
		}
	}
}