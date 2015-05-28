package gameshop.controller;

import gameshop.facade.AdministratorFacade;
import gameshop.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class AdministratorController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String password;

	/*@EJB
	private AdministratorFacade adminFacade;*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdministratorFacade getAdminFacade() {
		return adminFacade;
	}

	public void setAdminFacade(AdministratorFacade adminFacade) {
		this.adminFacade = adminFacade;
	}
}
