package validators;

public class EmailValidatorImpl implements EmailValidator {

	@Override
	public boolean validate(String email) {
		return email != null && !email.isEmpty() // && 
			//	email.replaceAll("[^@]", "").length() == 1
			//	&& !email.contains(".@")
				&& email.contains(".de");
	}

}
