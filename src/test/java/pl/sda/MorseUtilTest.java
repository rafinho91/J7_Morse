package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MorseUtilTest {

    @Test
    public void encodeMorse() {
        //given
        String textToEncode = "Litwo ojczYZno moja";
        String expectedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        //when
        String result = MorseUtil.encodeMorse(textToEncode.toUpperCase());
        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void decodeMorse() {
        //given
        String textToDecode = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        String expectedResult = "Litwo ojczyzno moja";
        //when
        String result = MorseUtil.decodeMorse(textToDecode);
        //then
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }
}