package standard_java.dh16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer4 implements Runnable{
    ServerSocket serverSocket=null;
    Thread[] threadArr;

    public static void main(String[] args) {
        TcpIpServer4 server=new TcpIpServer4(5);
        server.start();
    }

    public TcpIpServer4(int num) {
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "서버가 준비되었습니다.");

            threadArr = new Thread[num];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(getTime() + "연결 요청을 기다립니다.");
                //서버 소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 계속 기다린다.
                // 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.

                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + "로부터 연결 요청이 들어왔습니다.");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("[Notice] Test Message1 from Server");
                System.out.println(getTime() + "데이터를 전송했습니다.");

                dos.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread(this);
            threadArr[i].start();
        }
    }
    static String getTime(){
        String name=Thread.currentThread().getName();
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date()) + name;
    }

}
