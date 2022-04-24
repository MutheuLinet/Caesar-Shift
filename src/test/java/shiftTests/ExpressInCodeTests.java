package shiftTests;

import org.junit.jupiter.api.Test;
import shift.ExpressInCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExpressInCodeTests {
    @Test
    public void ExpressInCode_onlyActualStrings_Exception() throws Exception {
        ExpressInCode expressInCode = new ExpressInCode();
        String inputted = expressInCode.puttingIntoCode("123", 20);
        assertTrue(inputted != null);
    }


}