package ESTBatch;

public class Practise3 {

	public static void main(String[] args) {
		// Increment operators. 1.post increment, 2.pre increment, 3.assingment increment
		//incremnet
		int x = 10;
		//x++;
		//x+=5;
		//x-=6;
		//x*=5;
		x/=5;
	
		System.out.println(x);
		
		//post increment
		{
			int a = 20;
			System.out.println(a++);
			System.out.println(a);
			
			//pre increment
			{
				int b = 30;
				System.out.println(++b);
				System.out.println(b);
			}
		}

	}

}
