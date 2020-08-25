package ESTBatch;

import java.util.HashSet;

public class HashSetExp1 {

	public static void main(String[] args) {
		HashSet<Integer>Stu_age=new HashSet<Integer>();
		//size of HashSet
		System.out.println("The size is:"+ Stu_age.size());
		//push the value
		Stu_age.add(28);
		Stu_age.add(24);
		Stu_age.add(25);
		Stu_age.add(24);
		System.out.println("The size of the stu age:"+ Stu_age.size());
		//pull data for each loop
		for(Integer age:Stu_age)
		{
			System.out.println(age);
			
		}
		//remove the data
		Stu_age.remove(28);
		//pull data for each loop
		for(Integer ages:Stu_age)
		{
			System.out.println(ages);
			
		}
		
		//clear the data
		Stu_age.clear();
		System.out.println("The size is:" + Stu_age.size()); 

	}

}
