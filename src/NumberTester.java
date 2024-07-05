public class NumberTester {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        NumberTester tester = new NumberTester();

        //Should be true
        System.out.println("tester.isEven(10) = " + tester.isEven(10));
    }
}
