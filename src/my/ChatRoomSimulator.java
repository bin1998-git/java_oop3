package my;

import server.ch04.MultiClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatRoomSimulator {

    public static void main(String[] args) {
        int port = 5000;
        System.out.println("서버 시작 .... ");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
        serverSocket.accept();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (port != 5000) {
            System.out.println("서버가 불일치 하여 종료합니다");
        }





}


} // end of class
