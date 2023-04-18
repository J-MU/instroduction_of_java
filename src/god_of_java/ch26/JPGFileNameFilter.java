package god_of_java.ch26;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String filename) {
        if(filename.endsWith(".jpg")) return true; // 디렉토리와 file을 구분하지 못하기 때문에, 만약 .jpg로 끝나는 디렉터리가 있으면 필터로 걸러낼 수 없다.
        return false;
    }
}
