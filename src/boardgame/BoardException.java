package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String string;
	
	public BoardException(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
