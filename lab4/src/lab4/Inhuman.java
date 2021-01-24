package lab4;

public abstract class Inhuman {
	private String Name;
	private String Prop;
	public String getName() {
        return this.Name;
    }
	
    public void setName(String name) {
        this.Name = name;
    }
    public void setProp (String prop)
	{
		this.Prop= prop;
	}
	public String getProp ()
	{
		return this.Prop;
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
