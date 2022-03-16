
package Question6;
import java.util.Hashtable;
import java.util.Scanner;
public class HashSet12 {


public static void main(String[] args) {
	Scanner pro = new Scanner(System.in);
	Hashtable<String,String> scan=new Hashtable<String,String>();
	System.out.println("enter the product id and name;");
	for(int i=0;i<3;i++)
	{
		scan.put(pro.next(),pro.next());
	}
	System.out.println("the product list is:");
	System.out.println(scan);
	System.out.println("enter the product id to be removed:");
	String id = pro.next();
	scan.remove(id);
	System.out.println("item removed");
	System.out.println("the product list is:");
	System.out.println(scan.toString());
	System.out.println("enter the product id to be searched:");
	String sid=pro.next();
	if(scan.containsKey(sid))
	{
		System.out.println(scan.get(sid));
	}
	else {
		System.out.println("do not exist");
	}
}
}