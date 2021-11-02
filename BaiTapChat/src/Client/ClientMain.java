package Client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ClientMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            //output de co the gui thong diep ve server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            //userInput la noi dung client muon gui ve server
            String userInput;

            ClientRunnable clientRun = new ClientRunnable(socket);

            Thread th = new Thread(clientRun);

            th.start();

            //Dang nhap
            System.out.print("Enter your name : ");
            userInput = scanner.nextLine();

            System.out.print("Password : ");
            userInput += " " + scanner.nextLine();
            output.println(userInput);

            Thread.sleep(1000);

            do {
                userInput = scanner.nextLine();
                output.println(userInput);
            } while (!userInput.equals("exit"));// user exit
            System.out.println("bye");
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception occured in client main: " + Arrays.toString(e.getStackTrace()));
        }
    }

}
