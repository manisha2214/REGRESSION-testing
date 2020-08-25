package ESTBatch;

public class UpCastingExp1 {
	public void upcasting()
	{
		int a=30;
		int b=20;
		long c=a+b;
		System.out.println("upcasting value is:"+ c);
		//method
		long k=34;
		long h=54;
		float d=k+h;
		System.out.println("upcasting value is:" + d);
	}
	public void Downcasting()
	{
		float j=23;
		float x=45;
		int e= (int) (j+x);
		System.out.println("downcasting value is:"+ e);
	}

	public static void main(String[] args) {
		UpCastingExp1 obj = new UpCastingExp1();
		obj.upcasting();
		obj.Downcasting();

	}

}
