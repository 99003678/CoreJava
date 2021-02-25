package workspace;
public class Customer1 {

	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
		
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String m)
	{
	     mobile=m;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile: "+mobile);
	}
}
