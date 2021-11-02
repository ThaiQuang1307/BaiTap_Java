package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;


public class ServerMain {

    public static void main(String[] args) {
        System.out.println("Server is listening on port 1234");
        ArrayList<ServerThread> threadList = new ArrayList<>();

        ServerThread.init();
        try (ServerSocket serversocket = new ServerSocket(1234)) {
            while (true) {
                //Tao 1 thread moi khi co them 1 client
                Socket socket = serversocket.accept();
                ServerThread serverThread = new ServerThread(socket, threadList);
                threadList.add(serverThread);
                serverThread.start();
            }
        } catch (Exception e) {
            System.out.println("Error occured in main:" + Arrays.toString(e.getStackTrace()));
        }
    }
}
