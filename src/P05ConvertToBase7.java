import java.util.Scanner;

public class P05ConvertToBase7 {

	public static void main(String[] args) {
		
		Scanner userInp = new Scanner(System.in);
		int userNum = Integer.parseInt(userInp.nextLine());
		
		System.out.println(Integer.toString(userNum, 7));
		
		userInp.close();

	}

}
