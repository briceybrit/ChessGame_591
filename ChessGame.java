
public class ChessGame {
	
	ChessPieces[][] board = new ChessPieces[8][8];
	
	void display() {
		for (int i=0; i<8;i++) {
			for (int j=0; j<8; j++) {
				if (board[i][j] ==null) {
					System.out.print("__");
				}
				else {
					System.out.print(""+board[i][j].color.charAt(0)+""+board[i][j].type.charAt(0));
					
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		ChessGame game = new ChessGame();
		
		ChessPieces blackRook = new ChessPieces("black","rook");
//		blackRook.color = "black";
//		blackRook.type = "rook";
		
		game.board[0][0] = blackRook;
		
		ChessPieces blackKnight = new ChessPieces("black","knight");
//		blackKnight.color = "black";
//		blackKnight.type = "knight";
		
		game.board[0][1] = blackKnight;
		
		for(int i=0;i<8;i++) {
			ChessPieces whitePawn = new ChessPieces("white","pawn");
//			whitePawn.color = "white";
//			whitePawn.type = "pawn";
			game.board[6][i] = whitePawn;
		}
		game.display();
	}

}
