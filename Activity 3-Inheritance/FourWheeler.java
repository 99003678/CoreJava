import java.util.*;

public class FourWheeler extends Vehiclee
{
Scanner sc=new Scanner(System.in);
	private String audioSystem;
	private int noOfDoors;
	

	public FourWheeler(String make, String vehicleType, String fuelType, int fuelCapacity, int cc, String audioSystem, int noOfDoors) {
		super(make, vehicleType, fuelType, fuelCapacity, cc);
		this.sc = sc;
		this.audioSystem = audioSystem;
		this.noOfDoors = noOfDoors;
	}



	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	
	public void displayDetailInfo()
	{
		System.out.println("----Detail Info-----");
		System.out.println("Audio System: "+audioSystem);
		
		System.out.println("Number of doors: "+noOfDoors);
	}
}
