package ESTBatch;

public class ArgumentsExp1 {
	
	public void Add(int a, int b) {
	
	int c = a+b;
	System.out.println(c);
	
}

	public void Data(String name, String Batch, int age) {
		System.out.println(name);
		System.out.println(Batch);
		System.out.println(age);
		
	}
	
	public static void main(String[]args) {
		ArgumentsExp1 obj = new ArgumentsExp1();
		obj.Add(35, 57);
		obj.Data("Manisha", "2020", 29);
		
	}
	}