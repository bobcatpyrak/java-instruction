import java.util.List;
import java.util.stream.Collectors;

public class BookManagerApp {

    public static void main(String[] args) {
        
        List<Book> bookList = new BookCatalog().getCatalog();
        
        System.out.println("\nBOOKS BY TITLE:");
        bookList.stream()
        			.filter(b -> b.getTitle().equals("Java Programming"))
        			.forEach(System.out::println);
        

        System.out.println("\nBOOKS BY CATEGORY:");
        bookList.stream()
					.filter(b -> b.getCategory() == Book.JAVA)
					.forEach(System.out::println);
        

        System.out.println("\nBOOKS BY FORMAT:");
        bookList.stream()
					.filter(b -> b.getFormat() == Book.PAPERBACK)
					.forEach(System.out::println);
        
        
        List<String> str = bookList.stream()
        							.filter(b -> b.getCategory() == Book.DATABASE)
        							.map(b -> b.getTitle() + " (" + b.getFormat() + ")")
        							.collect(Collectors.toList());
        str.add(0, "\nDATABASE BOOK TITLES");
        for(String s : str)
        	System.out.println(s);
    }

}