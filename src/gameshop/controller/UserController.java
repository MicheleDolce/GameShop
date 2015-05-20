package gameshop.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class UserController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String userName;
	private String password;
	
	
	
	
	
	
}
