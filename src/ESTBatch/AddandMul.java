package ESTBatch;

public class AddandMul {
public void Add()

{
	int a = 55;
	int b = 44;
	int c = a+b;
	System.out.println("the value is:" + c);
}

public void Mul()
{
	
	int n = 567;
	int p = 908;
	int o = n*p;
	System.out.println("the vaLue is:" + o);
			
}

public void Sub()
{
	int d = 89;
	int h = 95;
	int y = d-h;
	System.out.println("the value is:" + y );
	

}

public void Div()
{
	int f = 86;
	int q = 49;
	int r = f/q;
	System.out.println("the value is:" + r);
	
}


public static void main(String[] args) {
	AddandMul obj = new AddandMul();
	obj.Add();
	obj.Mul();
	obj.Sub();
	obj.Div();

	}

}
