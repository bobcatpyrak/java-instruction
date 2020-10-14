package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;

public class StreamProcessingApp {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to stream processing app");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// pg. 717 - use stream to filter and process each contact
			// for each contact in the list without a phone number, print name in ALL CAPS
		contacts.stream()
			.filter(c -> c.getPhone() == null)
			.forEach(c -> System.out.println(c));
		
		List<Contact> contactsNoPhone = contacts.stream()
											.filter(c -> c.getPhone() == null)
											.collect(Collectors.toList());
		System.out.println("There are " + contactsNoPhone.size() + " contacts with no phone number.");
		
		// map
		List<String> contactNames = contacts.stream()
										.map(Contact::getName)
										.collect(Collectors.toList());
		contactNames.stream()
						.forEach(System.out::println);
	}

}
