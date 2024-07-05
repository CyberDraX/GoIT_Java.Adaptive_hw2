public class MathUtils {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        //Should be 5
        System.out.println("math.sum(3, 2) = " + math.sum(3, 2));
    }
}
