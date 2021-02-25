package workspace;
import java.util.*;
public class ClassExample 
{
public int number;
public String name;

public static void show()//static method
{
	System.out.println("I am static method");
}

public void display()//instance method
{
	vision();
	System.out.println("Reg no: "+number);
	System.out.println("Name: "+name);
}
public void vision() //instance method
{
	System.out.println("Our focus is to learn");
}
}
