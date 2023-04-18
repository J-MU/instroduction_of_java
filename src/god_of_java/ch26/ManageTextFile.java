package god_of_java.ch26;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.io.File.separator;
public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager=new ManageTextFile();
        int numberCount=10;

        String fullPath=separator+"godofjava"+separator+"text"+separator+"numbers.txt";

        manager.writeFile(fullPath,numberCount);
    }

    private void writeFile(String filename, int numberCount) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;

        try{
            fileWriter = new FileWriter(filename);
            bufferedWriter=new BufferedWriter(fileWriter);

            for(int loop=0; loop<numberCount; loop++){
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println("Write success !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(bufferedWriter!=null){
                try{
                    bufferedWriter.close();
                }catch(IOException ie){
                    ie.printStackTrace();
                }
            }
            if(fileWriter!=null){
                try{
                    fileWriter.close();
                }catch (IOException ie){
                    ie.printStackTrace();
                }
            }
        }
    }
}
