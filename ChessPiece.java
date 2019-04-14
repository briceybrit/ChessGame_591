* Commented by Ian Park
public class ChessPieces {
	
	String color;
	String type;
	
	
	public ChessPieces (String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	String display() {
		return "" + type;
	}
	

}
