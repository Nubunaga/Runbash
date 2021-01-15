package model;

import cmd.Bash;
import org.json.JSONArray;

/**
 * Process class takes commands and creates code that represents the commands.
 */
public class ProcessCommand {
    private String message;
    //TODO Implement Code

    /**
     * An empty constructor to be used when no
     * input is needed
     */
    public ProcessCommand(){
        message = "";
    }

    /**
     * Takes the commands and returns the message that is created
     * @return  A string representing the message created.
     */
    public String returnMessage(String[] commands){
        //TODO secure commands for improper input;
        try{
        return getCode(commands);
        }catch (IllegalArgumentException il){
            System.err.println("Wrong input detected");
            return "Wrong input detected";
        }
    }

    private String getCode(String[] commands){
        if(commands.length == 0){
            throw new IllegalArgumentException();
        }
        //while commands length != 0

        Bash cmd = new Bash();
        cmd.createJavaClass();
        // after commands is empty, send to bash handler.

        //return message received.
        return cmd.runBash();
    }


    private String findJsonCode(){
        return null;
    }

}
