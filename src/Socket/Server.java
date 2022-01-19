package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException ,InterruptedException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        System.out.println("Connected to Client");

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        new Thread(new Runnable() { //Writing Thread
            @Override
            public void run() {
                while(true)
                {
                    try {
                        String msg = br.readLine();
                        if(msg.equalsIgnoreCase("EXIT"))
                        {
                            dout.writeUTF("<== EXITING FROM APPLICATION ==>");

                            din.close();
                            dout.close();
                            s.close();
                            break;
                        }

                        dout.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() { //Reading Thread
            @Override
            public void run() {
                while(true)
                {
                    try {
                        System.out.println("\t\tClient : "+din.readUTF());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
