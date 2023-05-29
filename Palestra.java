package src;

import java.util.ArrayList;

public class Palestra {

	
	//è possibile avere più trainers diversi nella stessa area, perciò ho richiamato più volte nelle diverse classi i trainerid,
	//senza dover dipendere da una sola classe per trainerId
	//Domanda : come richiamare nel modo più efficiente ogni volta i trainerID? Possibile errore di ereditarietà
	private ArrayList<Integer> areas;
    private String[][] combinedMatrix;
    public Trainer trainerId;

    public Palestra() {
        areas = new ArrayList<>();
    }

    public ArrayList<Integer> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Integer> areas) {
        this.areas = areas;
    }

    public void addArea(int area) {
        areas.add(area);
    }
    
    //matrice che combina trainers all'area in cui si deve trovare- possibile errore nel tipo parametro trainerID
    public void combineMatrixWithString(String trainerId) {
        combinedMatrix = new String[areas.size()][2];

        for (int i = 0; i < areas.size(); i++) {
            combinedMatrix[i][0] = trainerId;
            combinedMatrix[i][1] = String.valueOf(areas.get(i));
        }
    }
    
    //manca definizione del tempo, libreria Java??!
}
