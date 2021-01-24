package lab4;

public class StatusException extends Exception{
	public StatusException()
	{
		super("Can't wake up when awake");
	}
}
