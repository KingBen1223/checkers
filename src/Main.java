/**
 * @author Daniel Russell
 * This is a checkers app 8 red and 8 black checker objects are created then the user is asked to select them and move around on the checker board
 * 
 */
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		int x = 0;//holds x value for board move
		int y = 0;//holds y value for board move
		
		//initializes the Checker Board
		Board.buildBoard();
		Board.redrawBoard();
		
		//Creates the red side of checkers on the board
		Checkers red1 = new Checkers("red","1", 6,1);
		Checkers red2 = new Checkers("red","2", 6,3);
		Checkers red3 = new Checkers("red","3", 6,5);
		Checkers red4 = new Checkers("red","4", 6,7);
		Checkers red5 = new Checkers("red","5", 7,0);
		Checkers red6 = new Checkers("red","6", 7,2);
		Checkers red7 = new Checkers("red","7", 7,4);
		Checkers red8 = new Checkers("red","8", 7,6);
		
		//creates the black side of heckers on the board
		Checkers black1 = new Checkers("black","1", 0,1);
		Checkers black2 = new Checkers("black","2", 0,3);
		Checkers black3 = new Checkers("black","3", 0,5);
		Checkers black4 = new Checkers("black","4", 0,7);
		Checkers black5 = new Checkers("black","5", 1,0);
		Checkers black6 = new Checkers("black","6", 1,2);
		Checkers black7 = new Checkers("black","7", 1,4);
		Checkers black8 = new Checkers("black","8", 1,6);

		
		Scanner key = new Scanner(System.in);
		String choice;//holds the selected checker name red is "r" black is "b" and then num 1-8 ex. "r1" moves red checker object one
		
		do {
			System.out.println("Blacks turn:\nBlack select checker to move(b1,b2...):");
			choice = key.nextLine();
			if (choice.equalsIgnoreCase("b1")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black1.move(x, y);
			} else if (choice.equalsIgnoreCase("b2")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black2.move(x, y);
			} else if (choice.equalsIgnoreCase("b3")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black3.move(x, y);
			} else if (choice.equalsIgnoreCase("b4")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black4.move(x, y);
			} else if (choice.equalsIgnoreCase("b5")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black5.move(x, y);
			} else if (choice.equalsIgnoreCase("b6")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black6.move(x, y);
			} else if (choice.equalsIgnoreCase("b7")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black7.move(x, y);
			} else if (choice.equalsIgnoreCase("b8")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				black8.move(x, y);
			} else
				System.out.println("not a valid choice!");
			//end of black moves
			key.nextLine();
			
			System.out.println("Reds Turn:\nselect Red checker to move:(r1,r2...)");
			choice = key.nextLine();
			if (choice.equalsIgnoreCase("r1")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red1.move(x, y);
			} else if (choice.equalsIgnoreCase("r2")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red2.move(x, y);
			} else if (choice.equalsIgnoreCase("r3")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red3.move(x, y);
			} else if (choice.equalsIgnoreCase("r4")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red4.move(x, y);
			} else if (choice.equalsIgnoreCase("r5")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red5.move(x, y);
			} else if (choice.equalsIgnoreCase("r6")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red6.move(x, y);
			} else if (choice.equalsIgnoreCase("r7")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red7.move(x, y);
			} else if (choice.equalsIgnoreCase("r8")) {
				System.out.println("select x,y position:");
				x = key.nextInt();
				y = key.nextInt();
				red8.move(x, y);
			} else
				System.out.println("not a valid choice!");
			//end of red moves
			
			key.nextLine();
			key.nextLine();
		} while (x != -1);
		System.out.println("Done.");
	}

}
