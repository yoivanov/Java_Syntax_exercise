import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P07Random {

	public static void main(String[] args) {
		
		Scanner userInp = new Scanner(System.in);
		int n = Integer.parseInt(userInp.nextLine());
		int m = Integer.parseInt(userInp.nextLine());

		Random rnd = new Random();
		ArrayList arr = new ArrayList();


		while (arr.size() < Math.abs(m - n) + 1) {
			int x = rnd.nextInt(Math.abs(m - n) + 1) + Math.min(n, m);
			if (arr.indexOf(x) < 0)
				arr.add(x);
		}
		
		
		System.out.println(Arrays.toString(arr.toArray()));

	}

}
