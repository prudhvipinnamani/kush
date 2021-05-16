//CONSTRUCTOR OVERLOADING

public class constr
{
	constr()
	{
		System.out.println("default constructor");	
	}
	
	constr(int a)
	{
		System.out.println("parameterised constructor");
	
	}
	
	constr(constr obj)
	{
		System.out.println("object as a parameter constructor");
	
	}
	
	public static void main(String Arg[]) 
    {
		constr d1=new constr();
		constr d2=new constr(10);
		constr d3=new constr(d2);
	}
}