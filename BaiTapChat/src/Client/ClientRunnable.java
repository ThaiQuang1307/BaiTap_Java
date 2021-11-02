package Client;

import Server.ServerThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;

public class ClientRunnable implements Runnable {

    private Socket socket;
    private BufferedReader input;

    public ClientRunnable(Socket s) throws IOException {
        this.input = new BufferedReader(new InputStreamReader(s.getInputStream()));

    }

    @Override
    public void run() {
        try {
            while (true) {
                String response = input.readLine();
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
