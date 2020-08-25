package ESTBatch;

public class MethodOverridingClassA {
	public void Jessy(String name,String name3, int age)
	{
		System.out.println(name);
		System.out.println(name3);
		System.out.println(age);
	}
	
     public void Jessy(String name2,int age,int age2)
     {
    	 System.out.println(name2);
    	 System.out.println(age);
    	 System.out.println(age2);
    	 
     }
     public void Jessy(int a,int b)
     {
    	 int c = a*b;
    	 System.out.print(c);
     }
     
}

