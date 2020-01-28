import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * @Author Sam Keim - GitHub @ SamTheEnby
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		
		validateName(name);

	}

	public static  boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z]+[A-Za-z]{2,27}[^0-9]";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[A-Za-z0-9._-]{5,30}@[A-Za-z0-9]{3,10}.[A-Za-z]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}-\\d{3}-\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "\\d{2}/\\d{2}/\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	public static boolean validateHTML(String HTML) {

		// change this to pass ALL tests
		String regex = "<[A-Za-z0-9]+></[A-Za-z0-9]+>";

		if (HTML.matches(regex)) {
			System.out.println("HTML tag is valid!");
			return true;
		} else {
			System.out.println("Sorry, HTML tag is not valid!");
			return false;
		}
	}
	

}
