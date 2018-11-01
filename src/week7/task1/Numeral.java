package week7.task1;

public class Numeral  extends Expression{
    private int value;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value+ "";
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
