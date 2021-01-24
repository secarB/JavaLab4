package lab4;


public class Water extends Inhuman implements SpecialActionwReason{
	private String location;
	Water(String Name,String location)
	{
		this.setName(Name);
		this.location=location;
	}
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	@Override
	public void specialActionwReason(String Reason, String location) {
		this.setLocation(location);
		System.out.println(this.getName() + " flowed in streams and waterfalls along the walls of the grotto and, " + Reason + "into its " + location.toString());
	}
	
	@Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
	

	
	
}
