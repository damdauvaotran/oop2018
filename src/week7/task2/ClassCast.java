package week7.task2;

public class ClassCast {
    public static void main(String[] args) {
        Exception e  = new Exception("Test");
        NullPointerException a = (NullPointerException) e;
    }
}
