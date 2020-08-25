package ESTBatch;

import java.util.HashMap;

public class HashMapExp1 {

	public static void main(String[] args) {
		//HashMap object
		HashMap<String,Integer>emp_name=new HashMap<String,Integer>();
		//verify the size of the HashMap
		System.out.println("The size is:" + emp_name.size());
		//push the value
		emp_name.put("Manisha", 29);
		emp_name.put("pawan", 45);
		emp_name.put("Anil", 56);
		emp_name.put("pawan", 78);
		emp_name.put("Shweta", 25);
		System.out.println("The size is:" + emp_name.size());
		//pull the value get method
		System.out.println(emp_name.get("Manisha"));
		System.out.println(emp_name.get("Shweta"));
		//fetch all keys.keyset
		for(String ename:emp_name.keySet())
		{
			System.out.println(ename);
			
		}
		//fetch all value_values
		for(Integer empage:emp_name.values())
			
		{
			System.out.println(empage);
			
		}
		//clear HashMap
		emp_name.clear();
		System.out.println("The size is:" + emp_name.size());

	}
	

}
