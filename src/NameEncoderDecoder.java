public class NameEncoderDecoder {

    public String encode (String name){
        String code = name.trim().replace("e","1")
                                 .replace("u","2")
                                 .replace("i","3")
                                 .replace("o","4")
                                 .replace("a","5");
        return "NOTFORYOU" + code + "YESNOTFORYOU";
    }

    public String decode (String name){
        String replaceFistPart = name.substring(9).replace("YESNOTFORYOU", "");
        String replaceSecondPart = replaceFistPart.strip();
        return replaceSecondPart.replace("1","e")
                                .replace("2","u")
                                .replace("3","i")
                                .replace("4","o")
                                .replace("5","a");
    }

    public static void main(String[] args) {
        NameEncoderDecoder ned = new NameEncoderDecoder();

        //Should be "NOTFORYOUCr5bYESNOTFORYOU"
        System.out.println("ned.encode(\"Crab\") = " + ned.encode("Crab"));
        //Should be "Crab"
        System.out.println("ned.decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + ned.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        //Should be "NOTFORYOU"
        System.out.println("ned.decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + ned.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
