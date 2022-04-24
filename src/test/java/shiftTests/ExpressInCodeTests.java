package shiftTests;

import org.junit.jupiter.api.Test;
import shift.ExpressInCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExpressInCodeTests {
    @Test
    public void ExpressInCode_onlyActualStrings_Exception() throws Exception {
        ExpressInCode expressInCode = new ExpressInCode();
        String inputted = expressInCode.puttingIntoCode("123", 1);
        assertTrue(inputted != null);
    }

    @Test
    public void ExpressInCode_tryCatch_Exception() {
        try {
            ExpressInCode expressInCode = new ExpressInCode();
            String inputted = expressInCode.puttingIntoCode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 20);
        } catch (Exception ex) {
            assertEquals("The shift key must be between 1 and 25", ex.getMessage());
        }
    }

    @Test
    public void ExpressInCode_codesText_String() throws Exception {
        ExpressInCode expressInCode = new ExpressInCode();
        String inputted = expressInCode.puttingIntoCode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23);
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", inputted);
    }

}