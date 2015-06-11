package gameshop.facade;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import gameshop.model.Utente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserFacade {

	
	 @PersistenceContext(unitName = "unit-GameShop")
	    private EntityManager em;
	 
	 public Utente registraUtente(String nome,String cognome, Float giornoDiNascita,Float meseDiNascita,Float annoDiNascita,String email,String indirizzo){
		 GregorianCalendar gc = new GregorianCalendar();
		 int anno = gc.get(Calendar.YEAR);
		 int mese = gc.get(Calendar.MONTH) + 1;
		 int giorno = gc.get(Calendar.DATE);
		 Date dataDiRegistrazione= new Date(anno,mese,giorno);
		 int giornoDiNascitaIntero = (int)giornoDiNascita.doubleValue();
		 int meseDiNascitaInt = (int)meseDiNascita.doubleValue();
		 int annoDiNascitaInt = (int)annoDiNascita.doubleValue();
		 Date dataDiNascita= new Date(annoDiNascitaInt,meseDiNascitaInt,giornoDiNascitaIntero);
		 Utente cliente= new Utente(nome,cognome,dataDiNascita,dataDiRegistrazione,indirizzo,email);
		 em.persist(cliente);
		 return cliente;
	 }
	 
}
