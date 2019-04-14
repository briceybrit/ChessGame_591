
public class ChessPiece {
	
	String color;
	String type;
	
	
	public ChessPiece (String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	String display() {
		return "" + type;
	}
	

}
