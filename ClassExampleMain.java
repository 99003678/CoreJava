
package workspace;
import java.util.*;

public class ClassExampleMain {
public static void main(String args[])
{
	ClassExample ce=new ClassExample();
	ce.number=100;
	ce.name="Ashu";
	ce.display();
	ClassExample.show();//Because it's a static method

}
}