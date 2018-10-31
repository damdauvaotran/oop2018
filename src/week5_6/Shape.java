package week5_6;

public abstract class Shape {
	private int x = 0;
	private int y = 0;
	String color = "red";
	boolean filled = true;

	public Shape(int x, int y,String color, boolean filled) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.filled = filled;
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

	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
	
	public void move(int xOffset, int yOffset) {
		this.x += xOffset;
		this.y += yOffset;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (filled != other.filled)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public abstract String toString();
	
}
