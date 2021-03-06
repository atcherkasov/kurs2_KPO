package p4_client_server.example_1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionServer {
    public static void main(String[] args) {
        String message = "Hello from server";
        int serverPortNimber = 3456;

        try {
            ServerSocket connectionSocket = new ServerSocket(serverPortNimber);
System.out.println("calling accept()...");
            Socket dataSocket = connectionSocket.accept();
System.out.println("accept() performed: dataSocket = " + dataSocket);

            PrintStream socketOutput = new PrintStream(dataSocket.getOutputStream());
            socketOutput.println(message);

System.out.println("response to client sent...");

            socketOutput.flush();
            dataSocket.close();
            connectionSocket.close();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
