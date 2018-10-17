package week5_6;

public abstract class Shape {
	private int x = 0;
	private int y = 0;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Shape() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
