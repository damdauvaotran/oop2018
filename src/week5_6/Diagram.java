package week5_6;

import java.util.ArrayList;

public class Diagram {
	ArrayList<Layer> layers ;
	
	
	public Diagram(ArrayList<Layer> layers) {
		this.layers = layers;
	}
	
	public Diagram() {

	}


	public void  removeALlCircle() {
		for (Layer l : this.layers) {
			l.deleteAllCirlce();
		}
	}
	
	
	public void printLayer() {
		for (Layer l  : layers) {
			l.printShape();
		}
	}
	
}
