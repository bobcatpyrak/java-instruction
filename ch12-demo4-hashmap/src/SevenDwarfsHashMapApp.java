import java.util.HashMap;
import java.util.Map;

public class SevenDwarfsHashMapApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		// create a hashmap 
		// must create keys for each
		
		HashMap<String, String> dwarfs = new HashMap<>();
		dwarfs.put("DC",  "Doc");
		dwarfs.put("DP",  "Dopey");
		dwarfs.put("GP",  "Grumpy");
		dwarfs.put("BF",  "Bashful");
		dwarfs.put("SP",  "Sleepy");
		dwarfs.put("SZ",  "Sneezy");
		dwarfs.put("HP",  "Happy");
		System.out.println("List of all dwarfs:");
		for (Map.Entry dwarf: dwarfs.entrySet())
		{
			System.out.println(dwarf.getKey() + "\t" + dwarf.getValue());
		}
		
		System.out.println(dwarfs);
		String str = "SP";
		System.out.println("Dwarf SP is " + dwarfs.get(str));
		System.out.println("Bye");
	}

}
