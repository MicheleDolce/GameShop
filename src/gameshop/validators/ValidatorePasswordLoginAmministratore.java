package gameshop.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;



public class ValidatorePasswordLoginAmministratore implements Validator{

	public void validate(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {
         
        String password = (String) value;
         
        if(!password.equals("amm")) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setSummary("password non valida");
            message.setDetail("password non valida");
            context.addMessage("userForm:password", message);
            throw new ValidatorException(message);
        }
    }
	
	
	
	
	
}