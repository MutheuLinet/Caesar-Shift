package shiftTests;

import org.junit.jupiter.api.Test;
import shift.Decode;
import shift.ExpressInCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecodeTests {
    @Test
    public void Decode_onlyActualStrings_Exception() throws Exception {
        Decode decode = new Decode();
        String inputted = decode.undoCode("ABC", 1);
        assertTrue(inputted != null);
    }
    @Test
    public void Decode_tryCatch_Exception() {
        try {
            Decode decode = new Decode();
            String inputted = decode.undoCode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 20);
        } catch (Exception ex) {
            assertEquals("The shift key must be between 1 and 25", ex.getMessage());
        }
    }
    @Test
    public void Decode_decodesText_String() throws Exception {
        Decode decode = new Decode();
        String inputted = decode.undoCode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23);
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", inputted);
    }
}
