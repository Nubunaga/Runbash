package model;

import cmd.Bash;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Process class takes commands and creates code that represents the commands.
 */
public class ProcessCommand {
    private HashMap<String, String> process;
    //TODO Implement Code

    /**
     * An empty constructor to be used when no
     * input is needed
     */
    public ProcessCommand() {
        process = new HashMap<>();
        init();
    }

    /**
     * Takes the commands and returns the message that is created
     *
     * @return A string representing the message created.
     */
    public String returnMessage(String[] commands) {
        //TODO secure commands for improper input;
        try {
            return getCode(commands);
        } catch (IllegalArgumentException il) {
            System.err.println("Wrong input detected");
            return "Wrong input detected";
        }
    }

    private void init() {
        JSONParser jsonParser = new JSONParser();

        try (FileReader fr = new FileReader("/home/nubunaga/IdeaProjects/RunBash/" +
                "src/main/resources/codeConnection.json")) {

            Object obj = jsonParser.parse(fr);
            JSONArray codeList = (JSONArray) obj;
            codeList.forEach(code -> parseJson((JSONObject) code));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void parseJson(JSONObject object) {
        JSONObject command = (JSONObject) object.get("command");

        String print = (String) command.get("print");
        process.put("print", print);

        String loop = (String) command.get("for");
        process.put("for", loop);

        String iF = (String) command.get("if");
        process.put("if", iF);

        String eL = (String) command.get("else");
        process.put("else", eL);
    }


    private String getCode(String[] commands) {
        if (commands.length == 0) {
            throw new IllegalArgumentException();
        }
        //while commands length != 0import org.json.JSONArray;
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < commands.length; i++) {
            String retrivedCode = process.get(commands[i]);
            if (retrivedCode == null) {
                throw new IllegalArgumentException("Non authorized code");
            }

            //TODO add code that creates a new class file

        }

        Bash cmd = new Bash();
        cmd.createJavaClass("PlaceHolder");
        // after commands is empty, send to bash handler.

        //return message received.
        return cmd.runBash();
    }

}
