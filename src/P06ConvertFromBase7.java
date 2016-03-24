import java.util.Scanner;

public class P06ConvertFromBase7 {

	public static void main(String[] args) {
		
		Scanner userInp = new Scanner(System.in);
		int userNum = Integer.parseInt(userInp.nextLine(),7);
		
		System.out.println(userNum);
		
		userInp.close();

	}

}
