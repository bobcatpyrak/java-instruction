package ui;
import java.util.*;
import java.util.function.*;
import business.*;

public class ContactManagerApp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to contact manager app");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		System.out.println("All Contacts:");
		displayContacts(contacts);
		
		System.out.println(("Contacts without phone numbers:"));
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c : contacts)
			if (c.getPhone() == null)
				contactsWithoutPhone.add(c);
		displayContacts(contactsWithoutPhone);
		
		System.out.println(("Contacts without email:"));
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c : contacts)
			if (c.getEmail() == null)
				contactsWithoutEmail.add(c);

		displayContacts(contactsWithoutEmail);
		
		System.out.println("===== using lambdas =====");
		System.out.println("no phone");
		contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() == null);
		displayContacts(contactsWithoutPhone);
		
		System.out.println("No email");
		contactsWithoutEmail = filterContactsPredicate(contacts, (c) -> {return c.getEmail() == null;});
		displayContacts(contactsWithoutEmail);
		
		System.out.println("===== using consumer =====");
		System.out.println("print names");
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		// Using Consumer without a method...
		System.out.println("\nUsing Consumer without a method to print names");
		Consumer<Contact> consumer = c -> System.out.println(c.getName());
		for (Contact c : contacts)
			consumer.accept(c);
		
		// Using Function
		System.out.println("\n===== using Function =====");
		System.out.println("phone numbers");
		List<String> contactPhoneNumbers = transformContacts(contacts,
				c -> {
						String phone = c.getPhone() == null?"n/a" : c.getPhone();
						return c.getName() + ": " + phone;
				});
		for (String s : contactPhoneNumbers)
			System.out.println(s);

		
		System.out.println("\nLet's transform the names to UPPER CASE");
		
		for (String s : transformContacts(contacts, c -> c.getName().toUpperCase()))
			System.out.println(s);
		
		System.out.println("buh-bye");
		
	}

	private static void displayContacts(List<Contact> contacts)
	{
		for (Contact c : contacts)
			System.out.println(c);
		
		System.out.println();
	}
	// TestContact interface
	private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition)
	{
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts)
			if (condition.test(c))
				filteredContacts.add(c);

		return filteredContacts;
	}
	// predicate interface pg. 709
	private static List<Contact> filterContactsPredicate(List<Contact> contacts, Predicate<Contact> condition)
	{
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c : contacts)
			if (condition.test(c))
				filteredContacts.add(c);
		
		return filteredContacts;
	}
	// Consumer interface pg. 711
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer)
	{
		for (Contact c : contacts)
			consumer.accept(c);
	}
	// Function Interface - pg. 713
	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function)
	{
		List<String> strings = new ArrayList<>();
		
		for (Contact c : contacts)
			strings.add(function.apply(c));
		
		return strings;
	}
	
	
	
	}
