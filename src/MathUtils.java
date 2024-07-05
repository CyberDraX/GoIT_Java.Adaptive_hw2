public class MathUtils {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public float twice (float a){
        return a / 0.5f;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        //Should be 5
        System.out.println("math.sum(3, 2) = " + math.sum(3, 2));

        //Should be 1
        System.out.println("math.sub(3, 2) = " + math.sub(3, 2));

        //Should be 14
        System.out.println("math.twice(7f) = " + math.twice(7));
    }
}
