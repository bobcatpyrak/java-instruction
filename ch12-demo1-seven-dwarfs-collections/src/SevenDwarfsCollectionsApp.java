import java.util.ArrayList;

public class SevenDwarfsCollectionsApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Howdy y'all");
		ArrayList<String> dwarfs = new ArrayList<>();
		dwarfs.add("Doc");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Sneezy");
		dwarfs.add("Happy");
		dwarfs.add("Grumpy");
		
		System.out.println(dwarfs);
		
		dwarfs.add(2, "Bashful");
		System.out.println(dwarfs);
		System.out.println("Dwarf at position 3: " + dwarfs.get(3));
		System.out.println("# of dwarfs: " + dwarfs.size());
		System.out.println("conains 'Happy'? " + dwarfs.contains("Happy"));
		System.out.println("conains 'happy'? " + dwarfs.contains("happy"));
		System.out.println("Index of Dopey: " + dwarfs.indexOf("Dopey"));
		dwarfs.add(3, "Grumpy");
		System.out.println(dwarfs);
		System.out.println(dwarfs.indexOf("Grumpy"));
		dwarfs.remove(dwarfs.indexOf("Grumpy"));
		System.out.println(dwarfs);
		System.out.println(dwarfs.indexOf("Grumpy"));
		dwarfs.add(3, "Grumpy");
		System.out.println(dwarfs);
		dwarfs.remove("Grumpy");
		System.out.println(dwarfs);
		System.out.println(dwarfs.indexOf("Grumpy"));
		System.out.println("Take care now");
	}

}
