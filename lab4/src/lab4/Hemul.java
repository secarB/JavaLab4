package lab4;
import java.util.Objects;

public class Hemul extends Person implements Move, WakeUp, Action,Mutter,WentOutAndSee,WringOut{
	private boolean isMuttering;
	private String seeWhat;
	private final Hand hand;
	public Hemul (String Name, String location, Status status)
	{
		this.setName(Name);
		this.setLocation(location);
		this.setStatus(status);
		hand = new Hand();
	}

	@Override
	public void wakeUp(String Reason, String location) throws StatusException  {
		if (this.getStatus() == Status.AWAKE) throw new StatusException();
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " woke up" +  " because " + "his " + location + " " + Reason);
	}	
	@Override
	public void move(String location) {
		this.setLocation(location);
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " went to " + location);
	}
	@Override
	public void wentOutAndSee(String what)
	{
		this.setLocation("out side");
		this.setSeeWhat(what);
		System.out.println(this.getName() + " went out to see " + what);
	}
	@Override
	public void wringOut(Dress dress)
	{
		this.hand.setInHand("dress");
		dress.setDry();
		System.out.println(this.getName() + " wrung out his dress");
	}
	@Override
    public void action(String action) {
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " " + action);
	}
		@Override
	public void mutter(String what)
	{
		this.setMutter(true);
		System.out.println(what + "-muttered " + this.getName());
	}
	public void setMutter(boolean isMuttering)
	{
		this.isMuttering = isMuttering;
	}
	public String getSeeWhat()
	{
		return this.seeWhat;
	}
	public void setSeeWhat(String seeWhat)
	{
		this.seeWhat = seeWhat;
	}
	public boolean getmutter()
	{
		return this.isMuttering;
	}
	public class Hand{
		private String inHand;
		public String getInHand()
		{
			return this.inHand;
		}
		public void setInHand(String inHand)
		{
			this.inHand=inHand;
		}
	}
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation()+ "status: " + this.getStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hemul)) return false;
        Hemul hemul = (Hemul) o;
        return Objects.equals(this.getName(), hemul.getName()) &&
                Objects.equals(this.getLocation(), hemul.getLocation()) &&
                Objects.equals(this.getStatus(), hemul.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getStatus());
    }

	
}
