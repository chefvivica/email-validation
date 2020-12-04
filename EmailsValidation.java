package validationofanemailid;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailsValidation {

	public static final String emailReg = "^[a-zA-Z0-9-_.]+@+[a-zA-Z0-9-_]+.com$";

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile(emailReg);
		Scanner reader = new Scanner(System.in);
		String exit = "\n\nFor exit please type \"quit\":\n\n";
		
		//using a while loop to keep checking the user's input email, if user's input equals to "quit", stop the program. 
		while (true) {
			System.out.println("Please enter your email address:");
			String email = reader.next();
			Matcher matcher = pattern.matcher(email);
			if(email.equals("quit")) {
				break;
			}
			System.out.println("---------------------------");
			System.out.println();
			System.out.println(matcher.matches() ? "your email: " + email + " is ready to go!" + exit
					: "Invalid email, please try again!" + exit);
			
		}
		reader.close();
		System.out.println("Good bye!");

	}

}
