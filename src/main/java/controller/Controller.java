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


    public String sendToProcess(String[] commands){
        return pC.returnMessage(commands);
    }



}
