package lab4;

public class Dress {
	private boolean isWet;
	public Dress(boolean isWet)
	{
		this.isWet = isWet;
	}
	public boolean isWet()
	{
		return this.isWet;
	}
	public void setDry()
	{
		this.isWet = false;
	}
	public void setWet()
	{
		this.isWet = true; 
	}
}
