package validators;

public class EmailValidatorImpl implements EmailValidator {

	private static final String INVALID_MAILBOX_CHARS = "(),:;<>[\\]";
	@Override
	public boolean validate(String email) {
		// Confirm that only one @ sign is present
		if (email == null 
			|| email.isEmpty() 
			|| email.contains(".@")
			|| !(email.replaceAll("[^@]", "").length() == 1)) {
			return false;
		}
		
		// Split out local and domain parts
		String mailbox = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@") + 1, email.length());
		
		// Mailbox cannot contain characters: (),:;<>[\]
		if (mailbox.contains(INVALID_MAILBOX_CHARS)){
			return false;
		}
		
		// If all of the above failed, return true
		return true;
	}

}
