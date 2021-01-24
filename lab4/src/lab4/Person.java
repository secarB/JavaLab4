package lab4;
import java.util.Objects;

public abstract class Person {
	private String Name;
	private String Location;
	private Status status;
    public String getName() {
        return this.Name;
    }
	public String getLocation() {
		return this.Location;
	}
	public void setLocation(String location)
	{
		this.Location=location;
	}
 
    public void setName(String name) {
        this.Name = name;
    }

    public void setStatus(Status status)
    {
    	this.status = status;
    }
    public Status getStatus() {
    	return this.status;
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
