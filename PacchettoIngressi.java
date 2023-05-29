package src;

public class PacchettoIngressi {
	private Service service;
	private Corso corso;
	private AttivitaSportiva attivitaSportiva;
	private SchedaAllenamento schedaAllenamento;
	
	public Service getService() {
		return service;
	}
	
	public Corso getCorso() {
		return corso;
	}
	
	public AttivitaSportiva getAttivitaSportiva() {
		return attivitaSportiva;
	}
	
	//metodi dei prezzi da definire anche nelle altre classi? Definite bene come mettere i prezzi o se è gia tutto incluso
	
	public void prezzoIngresso() {
		service.getCost();
	}
	
	public void prezzoAttivitaSportiva() {
		attivitaSportiva.getCost();
	}
	
	public void prezzoScheda() {
		schedaAllenamento.getCost();
	}
	
	public void prezzoCorso() {
		corso.getCost();
	}
	
	
	//manca metodo per prendere la durata!
}
