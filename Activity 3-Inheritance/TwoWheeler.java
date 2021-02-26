
public class TwoWheeler extends Vehiclee{
	
private boolean kickStartAvailable;



public TwoWheeler(String make, String vehicleType, String fuelType, int fuelCapacity, int cc,
		boolean kickStartAvailable) {
	super(make, vehicleType, fuelType, fuelCapacity, cc);
	this.kickStartAvailable = kickStartAvailable;
}

public boolean getKickStartAvailable() {
	return kickStartAvailable;
}

public void setKickStartAvailable(boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}

public void displayDetailInfo()
{
	System.out.println("----Detail Info-----");
	if(kickStartAvailable==true)
	{
	System.out.println("Availability of kick start: Yes");
	}
	else
	{
		System.out.println("Availability of kick start: No");
	}
}
}
