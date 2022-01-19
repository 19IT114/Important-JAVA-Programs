package Socket;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket s = new Socket("localhost",6666);
        System.out.println("Connected to Server");

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        new Thread(new Runnable() { //Writing Thread
            @Override
            public void run() {
                while(true)
                {
                    try {
                        String msg = br.readLine();
                        if(msg.equalsIgnoreCase("EXIT")) {
                            dout.writeUTF("<== EXITING FROM THE APPLICATION ==>");
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
                        System.out.println("\t\tServer : "+din.readUTF());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
