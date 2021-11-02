package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class ServerThread extends Thread {

    private Socket socket;
    private ArrayList<ServerThread> threadList;
    private PrintWriter output;
    private static int numOfUserAccount;
    private static String[] listUserAccount;

    public ServerThread(Socket socket, ArrayList<ServerThread> threads) {
        this.socket = socket;
        this.threadList = threads;
    }

    // kiem tra tai khoan dang nhap
    public boolean checkUserAccount(String username, String pass) {

        for (int i = 0; i < numOfUserAccount; i++) {
            String[] tmp = listUserAccount[i].split(" ");
            if (tmp[0].equals(username) && tmp[1].equals(pass)) {
                output.println("Welcome " + username);
                return true;
            }
        }
        output.println("Invalid User");
        return false;
    }

    public static void init() {
        try {
            //Duyet thong tin cac account trong file roi luu vao listUserAccount
            File x = new File("D:\\ThucTapBKAV\\BaiTapJava\\BaiTapChat\\user.txt");
            Scanner sc = new Scanner(x);
            numOfUserAccount = Integer.parseInt(sc.nextLine());
            listUserAccount = new String[numOfUserAccount];
            int i = 0;
            while (sc.hasNextLine()) {
                listUserAccount[i] = sc.nextLine();
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }


    }

    public void luuLichSuChat(String sender, String receiver, String noiDung) {

    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                // doc input tu client
                String outputString = input.readLine();
                System.out.println("Server received " + outputString);

                // neu client exit
                if (outputString.equals("exit")) {
                    break;
                }

                // neu outputString co chua dau cach, tuc la co nhieu hon 1 tu
                if (outputString.contains(" ")) {
                    // Chia nho outputString roi luu vao arr[]
                    String[] arr;
                    arr = outputString.split(" ");
                    if (!arr[0].equals("chat") && !arr[0].equals("chatfile")) {
                        // Dang nhap
                        if (!checkUserAccount(arr[0], arr[1])) {
                            output.println("Enter username & password: ");
                        } else
                            setName(arr[0]);
                    } else if (arr[0].equals("chat")) {
                        // Chat
                        // Chu y lenh chat co 2 dang sau :
                        // chat <ten nguoi nhan> <text>
                        // chatfile <ten nguoi nhan> <ten file>
                        StringBuilder tmp = new StringBuilder();
                        for (int i = 2; i < arr.length; i++) {
                            tmp.append(arr[i]).append(" ");
                        }
                        // tmp la chat text
                        printToClient(arr[1], tmp.toString());
                        luuLichSuChat(getName(), arr[1], tmp.toString());
                    } else {
                        // Truong hop gui file
                        File f = new File(arr[2]);
                        Scanner sc = new Scanner(f);
                        String noiDungFile = "";
                        // doc noi dung file
                        while (sc.hasNextLine()) {
                            noiDungFile += sc.nextLine() + "\n";
                        }
                        // gui noi dung file cho nguoi nhan
                        printToClient(arr[1], noiDungFile);

                        // ghi noi dung file vao FileNhan.txt
                        FileWriter fn = new FileWriter("F:\\FileNhan.txt");
                        fn.write(noiDungFile);
                        fn.close();
                        sc.close();
                        luuLichSuChat(getName(), arr[1], arr[2]);
                    }
                }
                // in danh sach nguoi online
                if (outputString.equals("inds")) {
                    output.println(inDSOnline());
                }
            }
        } catch (Exception e) {
            System.out.println("Error occured" + Arrays.toString(e.getStackTrace()));
        }
    }

    // gui thong diep den client
    private void printToClient(String username, String outputString) {
        for (ServerThread th : threadList) {
            if (th.getName().equals(username)) {
                th.output.println(getName() + " : " + outputString);
            }
        }
    }

    // in danh sach nguoi online
    private String inDSOnline() {
        StringBuilder s = new StringBuilder();
        for (ServerThread th : threadList) {
            s.append(th.getName()).append(" ");
        }
        return s.toString();
    }
}
