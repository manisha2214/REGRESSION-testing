package ESTBatch;

public class JavaEnumsExp1 {
// we not use public void in enum weekdays is a method name.
	enum Weekdays 
	{
		Sun,
		Mon,
		Tue,
		Wed,
		Thu,
		Fri,
		Sat,
		
		
	}
	//we need to create object for method name.
	public static void main(String[] args) {
		// print enum value
		Weekdays day = Weekdays.Fri;
		//print all enum values using for each loop we also don't use java keyword new
		for(Weekdays day_name:Weekdays.values())
		{
			System.out.println("The day name is:" + day_name);
		}
		

	}

}
