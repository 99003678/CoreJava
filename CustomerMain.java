package workspace;
public class CustomerMain {

	public static void main(String args[]) {
	Customer c=new Customer();
	
	c.setNumber(100);
	c.setName("Java");
	System.out.println(c.getNumber()+" "+c.getName());
}
}
