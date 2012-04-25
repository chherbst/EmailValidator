package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import validators.EmailValidator;
import validators.EmailValidatorImpl;

public class EmailValidatorTest {

	private EmailValidator emailValidator;
	
	@Before
	public void setUp() throws Exception {
		emailValidator = new EmailValidatorImpl();
	}

	@Test
	public void testValidate() {
		assertTrue(emailValidator.validate("christoph.herbst@mail.tu-berlin.de"));
		assertTrue(emailValidator.validate("chrherbst@cs.tu-berlin.de"));
		assertTrue(emailValidator.validate("rb.magnus@mailbox.tu-berlin.de"));
		assertTrue(emailValidator.validate("thamag@cs.tu-berlin.de"));
		assertFalse(emailValidator.validate(""));
		assertFalse(emailValidator.validate(null));
		assertFalse(emailValidator.validate("christoph.herbstmail.tu-berlin.de"));
		assertFalse(emailValidator.validate("christoph@herbst@mail.tu-berlin.de"));
		assertFalse(emailValidator.validate("christoph.herbst.@mail.tu-berlin.de"));
		assertTrue(emailValidator.validate("ashraf.a.tanin@mailbox.tu-berlin.de"));
		assertFalse(emailValidator.validate("ashraf.tanin.yahoo.com"));
		assertTrue(emailValidator.validate("ahmadnawid.mz@gmail.com"));
		assertFalse(emailValidator.validate("wazir@ahmadzai@gmail.com"));
				assertFalse(emailValidator.validate("asgharzada85@yahoo.com"));
		assertFalse(emailValidator.validate("naseri@@mailbox.tu-berlin.de"));
		assertTrue(emailValidator.validate("naseri@mailbox.tu-berlin.de"));
	}

}
