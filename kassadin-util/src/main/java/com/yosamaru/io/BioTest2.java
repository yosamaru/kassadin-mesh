package com.yosamaru.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BioTest2 {
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8081);
        int i = 0;
        while (i<100) {
            i++;
            new Thread(new Runnable() {
                public void run() {
                    Socket socket = null;
                    try {
                        socket = server.accept();
                        System.out.println("accept port:" + socket.getPort());
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String inData = null;
                        while ((inData = in.readLine()) != null) {
                            System.out.println("client port:" + socket.getPort());
                            System.out.println("input data:" + inData);
                            if ("close".equals(inData)) {
                                socket.close();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                    }
                }
            }).start();
        }
    }
}

