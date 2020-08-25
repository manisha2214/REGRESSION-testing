package ESTBatch;

public class MethodoverloadingExp1 {
	public void pawan(String name,String batch,int age)
	{
		System.out.println(name);
		System.out.println(batch);
		System.out.println(age);
		
	}
	public void pawan(String name1,String name2)
	{
		System.out.println(name1);
		System.out.println(name2);
		
		
	}
	

	public static void main(String[] args) {
		MethodoverloadingExp1 obj = new MethodoverloadingExp1();
		obj.pawan("Manisha", "Shrestha");
		obj.pawan("Manisha", "2017", 29);

	}

}
