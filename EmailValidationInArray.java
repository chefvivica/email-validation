package validationofanemailid;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationInArray {
	public static final String emailReg = "^[a-zA-Z0-9-_.]+@+[a-zA-Z0-9-_]+.com$";

	public static void main(String[] args) {
		List<String> emailList = new ArrayList<String>();
		emailList.add("hello.world@hcl.com");
		emailList.add("hello_world@hcl.com");
		emailList.add("hello-9@hcl.com");
		emailList.add("hello-9#@hcl.com");
		emailList.add("hello.world@.com");
		emailList.add("hello.world@hcl");
		emailList.add("hehhe.jj@hek.com");
		
		Pattern pattern = Pattern.compile(emailReg);
		
		for(String email : emailList) {
			Matcher matcher = pattern.matcher(email);
			System.out.println("This email " +email + " is " + (matcher.matches()? "vaild" : "invaild"));
			
		}
		
	}
}
