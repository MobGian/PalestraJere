package src;
public class Service {
	private String serviceName;
    private int cost;

    //in questa classe includo nei servizi anche l'ingresso
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // getter and setter for serviceName
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
