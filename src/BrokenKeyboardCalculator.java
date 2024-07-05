public class BrokenKeyboardCalculator {

    public int add (int a, int b){
        return a += b;
    }

    public int sub (int a, int b){
        return a -= b;
    }

    public int multiply (int a, int b){
        return a *= b;
    }

    public int divide (int a, int b){
        return a /= b;
    }

    public static void main (String[] args){
        BrokenKeyboardCalculator brokenKeyboardCalculator = new BrokenKeyboardCalculator();

        //Should be 8
        System.out.println("brokenKeyboardCalculator.add(5,3) = " + brokenKeyboardCalculator.add(5, 3));

        //Should be 1
        System.out.println("brokenKeyboardCalculator.sub(8,7) = " + brokenKeyboardCalculator.sub(8, 7));

        //Should be 100
        System.out.println("brokenKeyboardCalculator.multiply(1,100) = " + brokenKeyboardCalculator.multiply(1, 100));

        //Should be 2
        System.out.println("brokenKeyboardCalculator.divide(8,4) = " + brokenKeyboardCalculator.divide(8, 4));
    }
}
