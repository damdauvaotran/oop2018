package week5_6;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		
		
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2);
		Triangle triangle1 = new Triangle(1, 2, "red", true, 1, 2, 3, 4, 5, 6);
		Triangle triangle2 = new Triangle(1, 2, "red", true, 2, 2, 3, 4, 5, 6);
		ArrayList<Shape> a = new ArrayList<Shape>();
		a.add(circle1);
		a.add(circle2);
		a.add(triangle1);
		a.add(triangle2);
		Layer l = new Layer(a);
		ArrayList<Layer> ls = new ArrayList<Layer>();
		ls.add(l);
		Diagram diagram = new Diagram(ls);
		diagram.printLayer();
		diagram.removeALlCircle();
		System.out.println();
		diagram.printLayer();
		
		A m = new C();
		B n = (B) m; 
	}
}







class C implements A,B {}

interface A {}

interface B {}