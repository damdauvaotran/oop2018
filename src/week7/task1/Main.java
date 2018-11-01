package week7.task1;

public class Main {
    public static void main(String[] args) {
        Numeral num10 = new Numeral(10);
        Numeral num_1 = new Numeral(-1);
        Numeral num2 = new Numeral(2);
        Numeral num3 = new Numeral(3);
        Expression e10_2 = new Square(num10);
        Expression e10_2_1 = new Substraction(e10_2, num_1);
        Expression e10_2_1_2_3 = new Addition(e10_2_1, new Multiplication(num2, num3));
        Expression finalE = new Square(e10_2_1_2_3);
        System.out.println(finalE.evaluate());

        Expression divisionTest  = new Division(num10, new Numeral(0));
        try{
            divisionTest.evaluate();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
