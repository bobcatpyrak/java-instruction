
public class StringsApp {

	public static void main(String[] args) 
	{
		String name = "Eddie Van Halen";
		int index = name.indexOf(" ");
		System.out.println(index + ": " + name.charAt(index));
		int index2 = name.indexOf("e");
		System.out.println(index2 + ": " + name.charAt(index2));
		
		name = name.trim();
		System.out.println(name);
		String van = name.substring(name.indexOf("V"), name.indexOf("n")+1);
		System.out.println(van);
		String firstName = name.substring(0, name.indexOf(" "));
		System.out.println("First name = " + firstName);
		String middleName = name.substring(name.indexOf(" ") + 1, name.indexOf(" ", name.indexOf(" ")+1));
		System.out.println("Middle Name = " + middleName);
		name = name.replace("n", "m");
		System.out.println(name);
		
		String sentence = "Is it lunch time yet?";
		System.out.println(sentence);
		String[] words = sentence.split(" ");
		for (String s : words)
			System.out.println(s);
		
		StringBuilder sentence2 = new StringBuilder(16);
		sentence2.append("Hello, ");
		sentence2.append("how ");
		sentence2.append("are ");
		sentence2.append("you? ");
		System.out.println(sentence2);
		System.out.println("Capacity =  " + sentence2.capacity());
		System.out.println("Length = " + sentence2.length());
		
		sentence2.insert(5, " " + name);
		System.out.println(sentence2);
	}

}
