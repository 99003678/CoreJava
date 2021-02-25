package workspace;
import java.util.*;
public class DemoString {
public static void main(String [] args)
{
	String s1="hello";//String Literal
	String s2="hello";
	String s3=new String("hello");//String object and its values
	String s4=new String("hello");
	String s5=" Good Morning";
	
	System.out.println("length of hello: "+s1.length());
	System.out.println("Equal opr for literals: "+(s1==s2));
	System.out.println("Equal oprfor objects and its values: "+(s3==s4));//false reason heap value and address related
	System.out.println("Cross Check literals: "+s1.equals(s2));
	System.out.println("Cross Check content with objects: "+s3.equals(s4));
	System.out.println("Cross Check: "+s3.equals(s2));
	System.out.println("Concat: "+s1.concat(s5));
	s1=s1.concat(s5);
	System.out.println("Value of s1: "+s1);
	System.out.println("Value of s5: "+s5);
	
	String s6="Welcome to LTTS family";
	String [] s7=s6.split(" ");
	System.out.println(s6);
	for(String ls:s7)
	{
	System.out.println(ls);
	}
	
}
}
