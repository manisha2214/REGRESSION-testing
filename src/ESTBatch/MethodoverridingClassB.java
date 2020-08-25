package ESTBatch;

public class MethodoverridingClassB extends MethodOverridingClassA {
	public void Jessy(int age,String name4)
	{
		System.out.println(age);
		System.out.println(name4);
		
	}
	public void Jessy()
	{
		int d=45*65;
		System.out.println(d);
		
	}
	public void Jessy(String batch,int age,String name5)
	{
		System.out.println(batch);
		System.out.println(age);
		System.out.println(name5);
		
	}
	

	public static void main(String[] args) {
		MethodoverridingClassB obj = new MethodoverridingClassB();
		obj.Jessy();
		obj.Jessy(25, 45);
		obj.Jessy(45, "Manisha");
		obj.Jessy("Manisha", 78, 80);
		obj.Jessy("2020", 78, "Anil");
		obj.Jessy("Manisha", "Pawan", 45);
		

	}

}
