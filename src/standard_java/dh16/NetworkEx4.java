package standard_java.dh16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx4 {
    public static void main(String[] args) {
        URL url=null;
        String address = "http://www.naver.com";
        String line = "";

        try(BufferedReader input = new BufferedReader(new InputStreamReader(new URL(address).openStream()));){


            while((line=input.readLine())!=null){
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
