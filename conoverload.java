class constrt
{
	constrt() 
	{
		
		System.out.println("constructure with arguments");
	}
	
	
	constrt(int a)
    {
    	
    	System.out.println("constructure without arguments"+a);
    }
    
    
   
}

class conoverload  {
	public static void main(String args[])
	{
			constrt obj=new constrt();
			constrt obj1=new constrt(10);
	}
}