package model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit testing the process command class
 * @author Netanel Avraham Eklind
 */
public class ProcessCommandTest {
    ProcessCommand pC;

    @Before
    public void before(){
        pC = new ProcessCommand();
    }

    @After
    public void after(){
        pC = null;
    }

    @Test
    public void testCorrectMessageReturning(){
        String inputCommand = "Print \"hello world!\"";
        String[] commands = inputCommand.split(" ");

        String returnMessage = pC.returnMessage(commands);
        Assert.assertEquals("Expected \"hello world!\" but recived: " + returnMessage,
                "hello world!", returnMessage);
    }

    @Test
    public void testIncorrectNullMessage(){
        String[] commands ={};

        try{
            String returnMessage = pC.returnMessage(commands);
            Assert.assertEquals("Wrong input detected",returnMessage);
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }


}
