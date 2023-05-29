package src;

public class Corso {
	private String corsoId;
	private Trainer trainerId;
	private int cost;
	
	public String getCorsoId() {
		return corsoId;
	}
	
	public void setCorsoId(String corsoId) {
		this.corsoId = corsoId;
	}
	
	public Trainer getTrainer() {
		return trainerId;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
}
