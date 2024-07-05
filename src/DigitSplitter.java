public class DigitSplitter {

    public char getFirstDigit(int number){
        String textNumber = "" + number;
        return textNumber.charAt(0);
    }

    public char getSecondDigit(int number){
        String textNumber = "" + number;
        return textNumber.charAt(1);
    }

    public static void main(String[] args) {
        DigitSplitter digitSplitter = new DigitSplitter();

        //Should be 1
        System.out.println("digitSplitter.getFirstDigit(15) = " + digitSplitter.getFirstDigit(15));

        //Should be 5
        System.out.println("digitSplitter.getSecondDigit(15) = " + digitSplitter.getSecondDigit(15));
    }
}
