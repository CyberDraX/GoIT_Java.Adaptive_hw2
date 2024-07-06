public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
    }
}
