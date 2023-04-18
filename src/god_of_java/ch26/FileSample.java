package god_of_java.ch26;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample=new FileSample();
//        String pathName="C:\\godofjava\\text";
        String pathName="C:"+File.separator+"godofjava"+File.separator+"text";
//        sample.checkPath(pathName);
//        sample.makeDirs(pathName);
        sample.checkFileMethods(pathName);
    }


    private void makeDir(String pathName){
        File file=new File(pathName);
        System.out.println("Make "+pathName+" result = "+file.mkdir());
    }

    private void makeDirs(String pathName){
        File file=new File(pathName);
        System.out.println("Make "+pathName+" result = "+file.mkdirs());
    }

    private void checkPath(String pathName) {
        File file=new File(pathName);
        System.out.println(pathName+" is exist? ="+ file.exists());
    }

    private void checkFileMethods(String pathName){
        File file=new File(pathName);
        System.out.println(pathName+ " is directory? = "+file.isDirectory());
        System.out.println(pathName+ " is file?      = "+file.isFile());
        System.out.println(pathName+ " is hidden?    = "+file.isHidden());
    }
}
