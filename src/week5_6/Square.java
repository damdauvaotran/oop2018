package week5_6;

public class Square extends Shape {
	private int side = 0;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Square))
			return false;
		Square other = (Square) obj;
		if (side != other.side)
			return false;
		return true;
	}

	public String toString() {
		return "Square" + this.getSide() ;
	}

}
