/********************************************************************************************************2*4*w*
 * File:  PhoneValidator.java Course materials CST8277
 *
 * @author Teddy Yap
 * @author Shariar (Shawn) Emami
 * @author (original) Mike Norman
 */
package databank.jsf;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("phoneValidator")
public class PhoneValidator implements Validator<String> {

	// North American phone number pattern
	private static final Pattern PHONE_PATTERN = Pattern
			.compile("^(\\+\\d( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");

	@Override
	public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {

		if (value == null) {
			FacesMessage msg = new FacesMessage("Phone number should not be empty", "Invalid phone number format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		//TODO 08 - Complete the Matching using the PHONE_PATTERN above.
		//You can use methods matcher and matches from PHONE_PATTERN.
		//If match fails, create a new FacesMessage(String, String) object.
		//Use proper error messages.
		//Set the severity of your FacesMessage to FacesMessage.SEVERITY_ERROR.
		//Finally, throw an exception with the FacesMessage in it.
		//To know what exception should be thrown, look at the signature of this method.

	}

}
