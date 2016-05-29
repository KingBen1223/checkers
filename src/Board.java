import java.util.Arrays;

public class Board {

	static String[][] checkerBoard = new String[8][8];
	
	public static void buildBoard() {
		//fill array with spaces
		for(String[] row : checkerBoard)
	    {            
		   Arrays.fill(row, "  ");
	    }
	
		//fill every other spot with * on board
		for (int i=0; i < checkerBoard.length; i++ ){
			for (int j=0; j < checkerBoard.length; j++){
				if (i%2 ==0)
					if (j%2 ==0){
						checkerBoard[i][j] = " *";
				}
				if (i%2 != 0){
					if (j%2 !=0){
						checkerBoard[i][j] = " *";
					}
				}
			}//end of first for loop
			
		}
	}//end of build board

	public static void redrawBoard(){
		 int k = 1;
		 while(k <= 30){ System.out.print('-'); k++; }
		 System.out.println();
		 System.out.println(" |0 || 1|| 2|| 3|| 4|| 5|| 6|| 7|");

		 for (int i = 0; i < checkerBoard.length; i++)
		 {
			 System.out.print(i);
			 for(int j = 0; j < checkerBoard[i].length; j++)
			 {

				 System.out.print("|" + checkerBoard[i][j] + "|");

			 }
			 System.out.println();

		 }
		 k = 1;
		 while(k <= 34){ System.out.print('-'); k++; }
		 System.out.println();

	}//end of redraw board

	public static int[] addToBoard(int x, int y, int oldX, int oldY, String l,String num) {
		int[] xandY = new int[2];
		
		if (checkerBoard[x][y].equals("  ")){
			checkerBoard[oldX][oldY] = "  ";
			checkerBoard[x][y] = l+num;
			redrawBoard();
			xandY[0] = x;
			xandY[1] = y;
			return xandY;
		}
		else {
			System.out.println("Space is not open");
			redrawBoard();
			xandY[0] = oldX;
			xandY[1] = oldY;
			return xandY;
		}
	}//end of add board
	
	private String getBoard(int i, int j){
		return checkerBoard[i][j];
	}
	
	
	
}
