package ESTBatch;

public class StringExp4 {

	public static void main(String[] args) {
		String slogan = "Hai hello how are you";
		boolean Hari = slogan.startsWith("Hai");
		System.out.println(Hari);
		if(Hari)
		{
			System.out.println("The slogan starts with Hai");
			
		}
		else
		{
			System.out.println("The slogan will not starts with Hai");
		}
		boolean anil = slogan.endsWith("you");
		System.out.println(anil);
		if(anil)
		{
			System.out.println("slogan ends with you");
		}
		else
		{
			System.out.println("slogan not ends with you");
		}

	}

}
