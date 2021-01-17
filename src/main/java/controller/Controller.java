package controller;

import model.ProcessCommand;

/**
 * Controller class that sends the command to be processed and returns the code to be represented.
 * @author Netanel Avraham Eklind
 */
public class Controller {
    ProcessCommand pC;

    public Controller(){
        pC = new ProcessCommand();
    }

    /**
     * Calls the process command program to turn the command sequence into writable code.
     * @param commands          A string of commands to be processed.
     * @return                  The output of the command.
     */
    public String sendToProcess(String[] commands){
        return pC.returnMessage(commands);
    }



}
