import java.util.Scanner;

public class P10CharMultiplier {
	
	public static int multiplyChar(String string1, String string2){
		
		int sum = 0;
		int lenghtMin = Math.min(string1.length(), string2.length());
		
		for (int i = 0; i < lenghtMin; i++) {
			sum += string1.charAt(i)*string2.charAt(i);
		}
		
		if (string1.length() > lenghtMin) {
			for (int i = lenghtMin; i < string1.length(); i++) {
				sum += string1.charAt(i);
			}
		}
		
		if (string2.length() > lenghtMin) {
			for (int i = lenghtMin; i < string2.length(); i++) {
				sum += string1.charAt(i);
			}
		}
		
		return sum;		
	}
	
	
	public static void main(String[] args) {
		
		String userString;
		
		Scanner userInp = new Scanner(System.in);
		userString = userInp.nextLine();
		
		String[] userStrings = {
			userString.split(" ")[0],
			userString.split(" ")[1]
		};
		
		int result;
		
		result = multiplyChar(userStrings[0], userStrings[1]);
		
		System.out.println(result);
		
		userInp.close();
	}

}
