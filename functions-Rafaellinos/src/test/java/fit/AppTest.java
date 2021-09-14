package fit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.function.Function;

import org.junit.Test;

import fit.core.FuncLogger;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldLogWithFuncLogger()
    {
        //arrange
        String prefix = "[prefix]";
        String text = "hello";
        String expectedLog = String.format("%s %s", prefix, text);
        Function<String, String> logFunc = FuncLogger.create(prefix);
        
        // act
        String actualLog = logFunc.apply("hello");

        // assert
        assertEquals(actualLog, expectedLog);
    }
}
