package src;

import java.util.Date;

public class Cliente {
	private Date dateSubscription;
	private int payment;
	private int visits;
	private Tessera tessera;
	
	
	public Cliente(Date dateSubscription, int payment, int visits) {
		this.dateSubscription = dateSubscription;
		this.payment = payment;
		this.visits = visits;
	}
	
	public int countVisits() {
        return visits;
    }

    // Getters and setters per gli attributi
	
	public Tessera getTessera() {
		return tessera;
	}
    public Date getDateSubscription() {
        return dateSubscription;
    }

    public void setDateSubscription(Date dateSubscription) {
        this.dateSubscription = dateSubscription;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}
