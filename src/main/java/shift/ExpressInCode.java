package shift;

public class ExpressInCode {
    private String expressedInCode = "";

    public String puttingIntoCode(String regularText, int shiftKey) throws Exception {
        int l = regularText.length();

        if (shiftKey < 1 || shiftKey > 25) throw new Exception("The shift key must be between 1 and 25");

        for (int i=0; i<l; i++){

            char letter = regularText.charAt(i);

            if (Character.isLetter(letter)){
                if (Character.isUpperCase(letter)) {
                    char shiftedLetter = (char) (letter + shiftKey);
                    if (shiftedLetter > 'Z') {
                        expressedInCode += (char) (letter - (26 - shiftKey));
                    } else {
                        expressedInCode += shiftedLetter;
                    }
                }
            }else {
                expressedInCode += letter;
            }
        }
        return expressedInCode;
    }


}

