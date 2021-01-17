package model;
/*
* This class is used to generate the code to be sent to the bash script.
* Questions needed to answer:
* Can this be done so it is made in O(n) or less.
*
* @author Netanel Avraham Eklind
* */
public class CodeGenerator {
   private Code newCode;
   private boolean print = false;

    CodeGenerator(){
        newCode = new Code();
    }

    /**
     * Returns the code in string
     * @return a code in string.
     */
    String retriveCode(){
        return newCode.endCode();
    }

    boolean addCode(String codeSegment){
        return action(codeSegment);
    }

    private boolean action(String codeSegment){
        if(print){
            newCode.addMessage(codeSegment);
            return false;
        }
        switch (codeSegment){
            case "System.out.println(?)":
                addPrint(codeSegment);
                return true;
            default:
                return false;
        }
    }

    private void addPrint(String codeSegment){
        newCode.addCode(codeSegment);
        print = true;
    }



}
