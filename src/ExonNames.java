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

    /*public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf( name.charAt(name.length() - 1));
        return code.toUpperCase();
    }*/

    public boolean isMoneyName(String name){
        char firstWordNumber = name.charAt(0);
        char secondWordNumber = name.charAt(name.length() - 1);
        return firstWordNumber >= '0' && firstWordNumber <= '9' && secondWordNumber >= '0' && secondWordNumber <= '9';
    }

    /*public boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
    }*/

    public boolean isInvisibleName(String name){
        return name.isBlank();
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

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        boolean isMoneyName2 = names.isMoneyName("77Hero");
        System.out.println("names.isMoneyName2(\"77Hero\") = " + names.isMoneyName("77Hero"));

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);
    }
}