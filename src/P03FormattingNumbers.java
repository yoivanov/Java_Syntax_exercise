import java.util.Scanner;

public class P03FormattingNumbers {

	public static void main(String[] args) {
		
		int numberA;
		float numberB;
		float numberC;
		
		Scanner userInp = new Scanner(System.in);
		numberA = Integer.parseInt(userInp.nextLine());
		numberB = Float.parseFloat(userInp.nextLine());
		numberC = Float.parseFloat(userInp.nextLine());
		
		String binaryA = String.format("%10s", Integer.toString(numberA, 2));
		
		System.out.print("|");
		System.out.printf("%-10x", numberA);
		System.out.print("|");
		System.out.print(binaryA.replace(' ', '0'));
		System.out.print("|");
		System.out.printf("%10.2f", numberB);
		System.out.print("|");
		System.out.printf("%-10.3f", numberC);
		System.out.print("|");
		
		userInp.close();
	}

}
