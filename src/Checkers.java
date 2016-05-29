

public class Checkers {

	private String color;
	private String num;
	private String king;
	private int xPos;
	private int yPos;
	private int xandY[] = new int[2];

	Checkers(String color, String num, int x, int y){
		if(color.equalsIgnoreCase("red")){
			this.color = "r";
			this.num = num;
		}
		if(color.equalsIgnoreCase("black")){
			this.color = "b";
			this.num = num;
		}
		this.xPos = x;
		this.yPos = y;

		xandY = Board.addToBoard(xPos,yPos,xPos,yPos, this.color, this.num);
	}

	public void move(int x, int y){
		//move for regular checker and not being kinged
		if (color.equals("r") && x != 0){
			if((this.xPos-x==1) && (this.yPos-y==-1) || (this.yPos-y==1)){
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];
			}
			else {
				System.out.println("Invalid move for red");
				System.out.println("X:" + this.xPos + "  Y:" + this.yPos);
			}
		}//end of regular moves
		//for when a checker gets kinged
		else if (color.equals("r") && x == 0) {
			if((this.xPos-x==1) && (this.yPos-y==-1) || (this.yPos-y==1)){
				this.color="R";
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];
			}else
				System.out.println("error r & 0 error");
		}//end of changing regular checker into king
		//moving for a king checker
		else if(color.equals("R")){
			if((this.xPos-x==1) || (this.xPos-x==-1) && (this.yPos-y==-1) || (this.yPos-y==1)){
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];	
			}
		}//end of king moves

		//move for regular checker and not being kinged
		if (color.equals("b")){
			if((x-this.xPos==1) && (y-this.yPos==1) || (y-this.yPos==-1)){
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];
			}
			else 
				System.out.println("Invalid move for black");
		}//end of regular moves
		//for when a checker gets kinged
		else if (color.equals("b") && x == 0) {
			if((x-this.xPos==1) && (y-this.yPos==1) || (y-this.yPos==-1)){
				this.color="B";
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];
			}
		}//end of changing regular checker into king
		//moving for a king checker
		else if(color.equals("B")){
			if((this.xPos-x==1) || (this.xPos-x==-1) && (this.yPos-y==-1) || (this.yPos-y==1)){
				int oldX = this.xPos;
				int oldY = this.yPos;
				this.xPos = x;
				this.yPos = y;
				xandY = Board.addToBoard(xPos,yPos,oldX,oldY, this.color, this.num);
				this.xPos = xandY[0];
				this.yPos = xandY[1];	
			}
		}//end of king moves
	}
}
