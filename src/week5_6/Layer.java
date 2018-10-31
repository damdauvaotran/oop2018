package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer {

	private ArrayList<Shape> shapes;

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	public Layer(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public void deleteAllTriangle() {
		Iterator<Shape> i = this.shapes.iterator();
		while (i.hasNext()) {
			Shape shape  = i.next();
			if (shape instanceof Triangle) {
				i.remove();
			}
		}
	}
	
	public void deleteAllCirlce() {
		Iterator<Shape> i = this.shapes.iterator();
		while (i.hasNext()) {
			Shape shape  = i.next();
			if (shape instanceof Circle) {
				i.remove();
			}
		}
	}
	
	public void printShape() {
		for (Shape s: this.shapes) {
			System.out.print(s.toString()+ ", ");
		}
	}


	
}