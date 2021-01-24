package lab4;

public class MoveException extends RuntimeException {
	public MoveException()
	{
		super("No where to move");
	}
}
