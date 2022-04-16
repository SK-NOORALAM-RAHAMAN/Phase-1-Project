package Simplilearn.Phase1VirtualClassCurriculum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {

	public static boolean isValidEmail(String email) {
		String regex = "^(.+)@(.+)$";
		// initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Below email IDs are present in the System : \n");
		List<String> emails = new ArrayList<String>();
		emails.add("deep@example.me.org");
		emails.add("raj@example.me.org");
		emails.add("noor@example.me.org");
		emails.add("azan@example.me.org");
		for (String email : emails) {
			System.out.println(email);
		}
		System.out.println("\nEnter an email ID to search :");
		String input = sc.nextLine();
		Boolean exists = false;

		if (isValidEmail(input)) {
			for (String value : emails) {
				if (input.equals(value)) {
					exists = true;
				}
			}
			System.out.println("The email id " + input + (exists ? " is Found." : " Not found."));
		} else {
			System.out.println("This Email ID is inValid.");
		}

	}
}
