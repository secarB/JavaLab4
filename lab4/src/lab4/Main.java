package lab4;

public class Main {

	public static void main(String[] args) {
		
		Hemul hemul = new Hemul("Hemul","Unknow",Status.UNKNOW);
		Moomintroll moomintroll = new Moomintroll("Moomintroll","Unknow",Status.UNKNOW);
		moomintroll.talk("It's rain");
		Rainning r = new Rainning() {
			@Override
			public void rainning(Weather weather) {
				weather.setRain(true);
				System.out.println("It's rainning");
			}
		};
		Weather weather = new Weather();
		r.rainning(weather);
		try  {
			moomintroll.move("Hole");
		} catch (MoveException a)
		{
            System.out.println(a.getMessage());
		}
		hemul.move("Hole");
		hemul.action("wrapped himself in blankets");
		hemul.setStatus(Status.SLEEPING);
		moomintroll.action("wrapped himself in blanket");
		moomintroll.specialAction("under the light rustle of rain.");
	
		try {
			hemul.wakeUp("was flooded with water","test");
		} catch (StatusException e) {
			
            System.out.println(e.getMessage());
		}
	
		Rain rain = new Rain("rain","Warm summer");
		rain.rustle();
		Water water = new Water("Water","Unknow");
		water.specialActionwReason("as if on purpose","hole");
		hemul.mutter("Eh, adversity passions");
		Dress dress = new Dress(true);
		hemul.wringOut(dress);
		hemul.wentOutAndSee("weather");
		Everywhere everything = new Everywhere("gray, damp and uncomfortable");
	}

}
