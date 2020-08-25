package ESTBatch;

public class Arrayinsideclass {
	public void Array()
	{
		int[] a = new int[5];
		//insert into values in container
	
		a[0] = 34;
		a[1] = 43;
		a[2] = 32;
		a[3] = 54;
		a[4] = 65;
		System.out.println("The value a[0]:" + a[0]);
		System.out.println("The value a[1]:" + a[1]);
		System.out.println("The value a[2]:" + a[2]);
		System.out.println("The value a[3]:" + a[3]);
		System.out.println("The value a[4]:" + a[4]);
		//perform simple addition
		int c = a[2] + a[4];
		int s = a[3] - a[2];
		System.out.println(c);
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		Arrayinsideclass obj = new Arrayinsideclass();
		obj.Array();

	}

}
