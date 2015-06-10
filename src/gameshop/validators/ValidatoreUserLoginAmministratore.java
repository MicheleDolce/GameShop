package gameshop.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;



public class ValidatoreUserLoginAmministratore implements Validator{

	public void validate(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {
         
        String user = (String) value;
         
        if(!user.equals("amm")) {
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setSummary("input non valido");
            message.setDetail("input non valido");
            context.addMessage("userForm:user", message);
            throw new ValidatorException(message);
        }
    }
	
	
	
	
	
}
