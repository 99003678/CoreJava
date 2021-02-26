
public class Vehiclee 
{
	
private String make;
private String vehicleType;
private String fuelType;
private int fuelCapacity;
private int cc;


public Vehiclee(String make, String vehicleType, String fuelType, int fuelCapacity, int cc) {
	super();
	this.make = make;
	this.vehicleType = vehicleType;
	this.fuelType = fuelType;
	this.fuelCapacity = fuelCapacity;
	this.cc = cc;
}

public Vehiclee() {
	super();
}

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getFuelCapacity() {
	return fuelCapacity;
}
public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}

public void displaymake()
{
	System.out.println("***"+make+"***");
	
}
public void displayBasicInfo()
{
	System.out.println("----Basic Info-----");
	System.out.println("Vehicle type: "+getVehicleType());
	System.out.println("Fuel Type: "+getFuelType());
	System.out.println("Fuel Capacity: "+getFuelCapacity());
	System.out.println("CC: "+getCc());
}
public void displayDetailInfo()
{
	
}
}
