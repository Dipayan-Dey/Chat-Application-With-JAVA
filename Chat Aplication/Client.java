import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
try {
    Scanner msgInput=new Scanner(System.in);
    Socket socket=new Socket("localhost",6542);
    DataInputStream dis=new DataInputStream(socket.getInputStream());
    DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
    while(true){
      String msg=(String)dis.readUTF();
      System.out.println("Server: "+ msg);
      System.out.println("Enter Message:");
       msg=msgInput.nextLine();
       dos.writeUTF(msg);
       dos.flush();

    }
} 
catch (Exception e) {
    // TODO: handle exception
}
        
    }
}
