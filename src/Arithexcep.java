public class Arithexcep {
    public static void main(String[] args) {
        try {
           int divideByZero = 20 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("Its finally blocked");
        }
    }
}
