import java.util.*;

public class ReplaceVowelsApp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String newStr = "";
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				str = str.replace(c[i], '*');
			}
		}
		System.out.println(str);
		
		System.out.println("Try again using regular expressions (regex)");
		System.out.println("Enter another string bro");
		str = sc.nextLine();
		str = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(str);
	}

}
