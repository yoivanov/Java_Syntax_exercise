import java.util.Scanner;

public class P01RectangleArea {

	public static void main(String[] args) {
		
		String userSides;
		int a = 0;
		int b = 0;
		int area;
		
		System.out.println("Type in the sides of a rectangle");
		System.out.println("Integers are needed separated by single space");
		
		Scanner userInp = new Scanner(System.in);
		userSides = userInp.nextLine();
		
		//int[] myIntArray = new int[]{1,2,3}
		
		String[] sides = new String[2];
		sides[0] = userSides.split(" ")[0];
		sides[1] = userSides.split(" ")[1];
		
		a = Integer.parseInt(sides[0]);
		b = Integer.parseInt(sides[1]);
		
		area = a*b;
		System.out.println(area);
		
		userInp.close();
	}

}
