
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniParkingFunctionsTest {


    @Test
    public void testThatWhenICheckASlotItReturnsTrueIfEmpty() 
        MiniParkingFunctions.resetParkingLot();
        
        int slot = 1;
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot);
        boolean expectedAnswer = true;
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void testThatWhenICheckASlotItReturnsFalseIfItsFilledUp() {

        
        MiniParkingFunctions.resetParkingLot();
        int slot = 1;
        MiniParkingFunctions.chooseSlot(slot);
        boolean actualAnswer = MiniParkingFunctions.isSlotEmpty(slot)
        boolean expectedAnswer = false;

        
        assertEquals(expectedAnswer, actualAnswer);
    }


