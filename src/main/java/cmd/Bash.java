package cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * A class that is used to test using bash within java.
 * This call will be used when working to run another bash program
 * on the side allowing the user to create a java program on the side.
 * This is the first step into creating a simple pseudo code compiler.
 *
 * @author Netanel Avraham Eklind
 */

public class Bash {

    public static void main(String[] arg){
            Bash bash = new Bash();
            bash.createJavaClass("");
            bash.runBash();
    }

    public void createJavaClass(String code){
        File newClass = new File("/home/nubunaga/IdeaProjects/RunBash/src/main/newClasses/Testing.java");
        try {
        FileWriter fw = new FileWriter(newClass);
        fw.write(code);
        fw.close();
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

    }

    public String runBash(){
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("sh","/home/nubunaga/IdeaProjects/RunBash/src/main/bash/test.sh");
        try{
            Process process = processBuilder.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            StringBuilder sb = new StringBuilder();


            while((line = br.readLine()) != null){
                sb.append(line);
            }
            return sb.toString();
        }catch (Exception e){
            System.out.println("Something went terrybly wrong");
            return "Error!";
        }
    }


}
