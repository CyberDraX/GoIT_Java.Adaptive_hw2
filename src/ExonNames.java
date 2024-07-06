public class ExonNames {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName (String firstName, String lastName){
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky (String name){
        return name.toLowerCase().contains("a") || name.toLowerCase().contains("o");
    }

    public String getNameCode (String name){
        if (name.length() > 1){
            String part1 = name.substring(1,name.length()- 1);
            String replace = name.replace(part1, "");
            return String.join("", replace).toUpperCase();
        } else {
            String part2 = name.substring(0,1);
            return part2.toUpperCase();
        }
        }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be X
        String nameCode1 = names.getNameCode("x");
        System.out.println("names.getNameCode(\"x\") = " + nameCode1);
    }
}