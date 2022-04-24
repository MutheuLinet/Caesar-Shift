package shift;

public class Decode {

    private String decodedText = "";

    public String undoCode(String codedText, int shiftKey) throws Exception{
        if (shiftKey < 1 || shiftKey > 25) throw new Exception("The shift key must be between 1 and 25");

        int l = codedText.length();

        for (int i=0; i<l; i++){
            char letter = codedText.charAt(i);
            if (Character.isLetter(letter)){
                if (Character.isUpperCase(letter)){
                    char shiftedLetter = (char) (letter-shiftKey);
                    if (shiftedLetter <'A'){
                        decodedText+= (char)(letter+(26-shiftKey));
                    } else {
                        decodedText+=shiftedLetter;
                    }
                }
            }else codedText+=letter;

        }
        return decodedText;
    }
}
