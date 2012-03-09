import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by IntelliJ IDEA.
 * User: TurmDrummer
 * Date: 07.03.12
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */
public class Excercise1Test {

    @Test
    public void Assert_That_1_Xor_1_Equals_0(){
        String result = Excercise1.XorTwoBitStrings("1", "1")   ;
        assertTrue ("0".equals(result));

    }
    @Test
    public void Assert_That_0_Xor_1_Equals_1(){
        String result = Excercise1.XorTwoBitStrings("0", "1")   ;
        assertTrue ("1".equals(result));

    }
    @Test
    public void Assert_That_1_Xor_0_Equals_1(){
        String result = Excercise1.XorTwoBitStrings("1", "0")   ;
        assertTrue ("1".equals(result));

    }
    @Test
    public void Assert_That_0_Xor_0_Equals_0(){
        String result = Excercise1.XorTwoBitStrings("0", "0")   ;
        assertTrue ("0".equals(result));

    }

    @Test
    public void Assert_That_Xoring_Large_Bitstrings_Works_Correct(){
        String result = Excercise1.XorTwoBitStrings("10010100101001", "01101011010111")   ;
        assertTrue ("11111111111110".equals(result));
    }

    @Test
    public void Return_String_Should_Be_As_Long_As_Shortest_Input(){
        String result = Excercise1.XorTwoBitStrings("101", "11")   ;
        assertTrue (result.length()==2);
    }

    @Test
    public void Should_Correctly_Convert_Hex_To_BitString(){
        String result = Excercise1.ConvertHexStringToBitString("ff")   ;
        assertTrue (result.equals("11111111"));
    }
}
