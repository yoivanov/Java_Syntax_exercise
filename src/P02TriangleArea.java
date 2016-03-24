import java.util.Scanner;

public class P02TriangleArea {

	public static void main(String[] args) {
		
		String userPointX;
		String userPointY;
		String userPointZ;
		
		Scanner userInp = new Scanner(System.in);
		userPointX = userInp.nextLine();
		userPointY = userInp.nextLine();
		userPointZ = userInp.nextLine();
		
		int[] sidesX = {Integer.parseInt(userPointX.split(" ")[0]),Integer.parseInt(userPointX.split(" ")[1])};
		int[] sidesY = {Integer.parseInt(userPointY.split(" ")[0]),Integer.parseInt(userPointY.split(" ")[1])};
		int[] sidesZ = {Integer.parseInt(userPointZ.split(" ")[0]),Integer.parseInt(userPointZ.split(" ")[1])};
		
		//double a = Math.sqrt(Math.pow((sidesY[0] - sidesX[0]), 2) + Math.pow((sidesY[1] - sidesX[1]), 2));
		//System.out.println(a);
		//double b = Math.sqrt(Math.pow((sidesZ[0] - sidesY[0]), 2) + Math.pow((sidesZ[1] - sidesY[1]), 2));
		//System.out.println(b);
		//double c = Math.sqrt(Math.pow((sidesX[0] - sidesZ[0]), 2) + Math.pow((sidesX[1] - sidesZ[1]), 2));
		//System.out.println(c);
		//Cheron forumla uses sides, answer is a bit different
		
		int area = Math.abs((sidesX[0]*(sidesY[1] - sidesZ[1]) + sidesY[0]*(sidesZ[1] - sidesX[1]) + sidesZ[0]*(sidesX[1] - sidesY[1]))/2);
		
		System.out.println(area);
		
		userInp.close();
	}

}
