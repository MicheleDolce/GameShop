package gameshop.facade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import gameshop.model.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserFacade {

	
	 @PersistenceContext(unitName = "unit-GameShop")
	    private EntityManager em;
	 
	 public Cliente registraUtente(String nome,String cognome, int giornoDiNascita,int meseDiNascita,int annoDiNascita,String email,String indirizzo){
		 GregorianCalendar gc = new GregorianCalendar();
		 int anno = gc.get(Calendar.YEAR);
		 int mese = gc.get(Calendar.MONTH) + 1;
		 int giorno = gc.get(Calendar.DATE);
		 Date dataDiRegistrazione= new Date(anno,mese,giorno);
		 Date dataDiNascita= new Date(annoDiNascita,meseDiNascita,giornoDiNascita);
		 Cliente cliente= new Cliente(nome,cognome,dataDiNascita,dataDiRegistrazione,indirizzo,email);
		 em.persist(cliente);
		 return cliente;
	 }
	 
}
