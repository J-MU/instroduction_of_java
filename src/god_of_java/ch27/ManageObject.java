package god_of_java.ch27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator + "godofjava" + separator + "text" + separator + "serial.obj";

//        SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
//        manager.saveObject(fullPath, dto);
        manager.loadObject(fullPath);
    }

    private void saveObject(String fullPath, SerialDTO dto) {

        try (FileOutputStream fos=new FileOutputStream(fullPath);
             ObjectOutputStream oos=new ObjectOutputStream(fos)
        ){
            oos.writeObject(dto);
            System.out.println("Write Success");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void loadObject(String fullPath){
        try(FileInputStream fis=new FileInputStream(fullPath);
            ObjectInputStream ois=new ObjectInputStream(fis);
        ){
            Object obj=ois.readObject();
            SerialDTO dto=(SerialDTO) obj;
            System.out.println(dto);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
