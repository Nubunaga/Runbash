package model;

/**
 * This class represents the code and expected response that a user
 * should receive from the code.
 * @author Netanel Avraham Eklind
 */
public class Code {
    private StringBuilder code;

    Code(){
         code = new StringBuilder("public class Testing{\n");
         code.append("public static void main (String[] args){\n");
    }


    void addCode(String newCodeSnip){
        code.append(newCodeSnip);
        code.append(";");
    }

    void addMessage(String message){
        int index = code.indexOf("?");
        code.replace(index,index+1,"\""+message+"\"");
    }

    /**
     * Ends the code and returns the string.
     * */
    public String endCode(){
        code.append("}");
        code.append("}");
        return code.toString();
    }

    /*For basic debug*/
    public static void main(String[] args){
        Code code = new Code();
        code.addCode("System.out.println(?)");
        code.addMessage("\"Hello\"");
        code.endCode();
    }



}
