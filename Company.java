package workspace;
public class Company {
private String name;
private String employees;
private String teamlead;

public String getName()
{
	return name;
}
public void setName(String n)

{
	name=n;
}
public String getEmployees()
{
	return employees;
}
public void setEmployees(String e)
{
	employees=e;
}
public String getTeamlead()
{
	return teamlead;
}
public void setTeamlead(String t)
{
	teamlead=t;
}
public void display()
{
	System.out.println("Name: "+name);
	System.out.println("Employees: "+employees);
	System.out.println("Teamlead: "+teamlead);
	
}
}
