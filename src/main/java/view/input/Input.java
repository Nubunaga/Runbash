package view.input;

import controller.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Input class handles the view.input from user and sends the information
 * to the controller.
 *
 * @author Netanel Avraham Eklind
 */

public class Input {
    Controller controller;
    public Input(){
        controller = new Controller();
    }

    /**
     * Takes view.input from the user and processes it to be sent as
     * a command to be read.
     */
    public void takeInput() {
        String input = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            while((input = br.readLine()) != null){
                sb.append(input);
            }
            String[] commands = sb.toString().split(" ");
            System.out.println(controller.sendToProcess(commands));
        } catch (Exception e) {
            System.out.println("Error on input stream!");
        }

    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        new Input().takeInput();
        System.err.println(((System.currentTimeMillis()-before)/1000)+" Seconds");
    }
}
