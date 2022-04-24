package shift;

public class Decode {

    private String decodedText = "";

    public String undoCode(String codedText, int shiftKey) throws Exception{
        if (shiftKey < 1 || shiftKey > 25) throw new Exception("The shift key must be between 1 and 25");

        int l = codedText.length();

        for (int i=0; i<l; i++){

        }
        return decodedText;
    }
}
