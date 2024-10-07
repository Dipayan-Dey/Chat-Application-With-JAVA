import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Server{
    public static void main(String[] args) {
try {
    Scanner msgInput=new Scanner(System.in);
    ServerSocket ss=new ServerSocket(6542);
    System.out.println("Waiting For Connection........");
    Socket socket=ss.accept();
    System.out.println("Connection Estublished.");
    DataInputStream dis=new DataInputStream(socket.getInputStream());
    DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
    while(true){
        System.out.println("Enter Message:");
       String msg=msgInput.nextLine();
        dos.writeUTF(msg);
        dos.flush();
         msg=(String)dis.readUTF();
        System.out.println("Client: "+ msg);
    }
} catch (Exception e) {
    // TODO: handle exception
}

    }
}