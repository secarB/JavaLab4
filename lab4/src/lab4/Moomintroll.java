package lab4;

import java.util.Objects;

public class Moomintroll  extends Person implements Move,Action,SpecialAction,Talk{
	private Mouth mouth;
	public  Moomintroll(String Name, String location, Status status )
	{
		this.setName(Name);
		this.setLocation(location);
		this.setStatus(status);
		mouth = new Mouth(false);
	}
	@Override
	public void specialAction(String location) {
		if (this.getStatus() != Status.SLEEPING) {
			this.setStatus(Status.SLEEPING);
			System.out.println (this.getName()+ "turned out the lamp and fell asleep " + location);
		} 
	}
	@Override
	public void move(String location) {
		if (location == "") throw new MoveException();
		this.setLocation(location);
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " went to " + location.toString());
	}
	@Override
	public void talk(String what)
	{
		mouth.setTalk(true);
		System.out.println(what + " " + this.getName() + " said");
	}
	@Override
    public void action(String action) {
		this.setStatus(Status.AWAKE);
		System.out.println(this.getName() + " " + action);
	}
	 static class Mouth {
			private boolean isTalking;
			public Mouth(boolean isTalking)
			{
				this.isTalking= isTalking;
			}
			public boolean isTalking()
			{
				return this.isTalking;
			}
			
			public void setTalk(boolean Talk)
			{
				isTalking=Talk;
			}
				
		}
	@Override
    public String toString() {
        return "Name: " + this.getName()  + "location: " + this.getLocation()+ "status: " + this.getStatus();
    }
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moomintroll)) return false;
        Moomintroll moomintroll = (Moomintroll) o;
        return Objects.equals(this.getName(), moomintroll.getName()) &&
                Objects.equals(this.getLocation(), moomintroll.getLocation()) &&
                Objects.equals(this.getStatus(), moomintroll.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getStatus());
    }
    
	

}
