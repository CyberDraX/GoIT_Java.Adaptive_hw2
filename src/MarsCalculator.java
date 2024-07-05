public class MarsCalculator {

    public int sum (int a, int b, int c){
        return a + b + c;
    }

    public int sub (int a, int b, int c){
        return a - (b + c);
    }

    public int multiply (int a, int b, int c){
        return sum(a,b,c) * sub(a,b,c);
    }

    public float divide (int a, int b, int c){
        return (float) sum(a,b,c) / 10;
    }

    public static void main(String[] args){
        MarsCalculator calculator = new MarsCalculator();

        //Should be 5
        System.out.println("calculator.sum(1,2,3) = " + calculator.sum(1, 2, 3));

        //Should be -4
        System.out.println("calculator.sub(1,2,3) = " + calculator.sub(1, 2, 3));

        //Should be -24
        System.out.println("calculator.multiply(1,2,3) = " + calculator.multiply(1, 2, 3));

        //Should be 0.6
        System.out.println("calculator.divide(1,2,3) = " + calculator.divide(1, 2, 3));
    }
}
