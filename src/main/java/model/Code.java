package model;

/**
 * This class represents the code and expected response that a user
 * should receive from the code.
 * @author Netanel Avraham Eklind
 */
public class Code {
    private StringBuilder code;

    public Code(){
         code = new StringBuilder("public class{\n");
    }

    

    /**
     * Ends the code and returns the string.
     * */
    public String endCode(){
        code.append("}");
        return code.toString();
    }



}