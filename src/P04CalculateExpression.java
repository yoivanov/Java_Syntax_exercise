import java.util.Scanner;

public class P04CalculateExpression {

	public static void main(String[] args) {
		
		Scanner userInp = new Scanner(System.in);
		
		float userA = Float.parseFloat(userInp.nextLine());
		float userB = Float.parseFloat(userInp.nextLine());
		float userC = Float.parseFloat(userInp.nextLine());
		
		//((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
		
		double fOneRes = 
		Math.pow((Math.pow(userA, 2) + Math.pow(userB, 2))/(Math.pow(userA, 2) - Math.pow(userB, 2)),((userA + userB + userC)/Math.sqrt(userC)));
		
		double fTwoRes =
		Math.pow((Math.pow(userA, 2) + Math.pow(userB, 2) - Math.pow(userC, 3)), (userA - userB));
		
		double threeAverage = (userA + userB + userC)/3;
		double formulaeAverage = (fOneRes + fTwoRes)/2;
		double diff = threeAverage - formulaeAverage;
		
		System.out.print("F1 result: " + fOneRes + ";");
		System.out.print("F2 result: " + fTwoRes + ";");
		System.out.print("Diff: " + diff + ";");
		
		//nqma iziskvaniq za formatirane v uslovieto
		
		userInp.close();

	}

}
