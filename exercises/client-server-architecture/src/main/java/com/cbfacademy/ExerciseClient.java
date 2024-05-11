package com.cbfacademy;

/*a ExerciseClient class which requests a connection to server, 
sends a simple text message to the server.
Ensure to release all resources at the end of your program.*/
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 4040;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            // Send a simple text message to the server
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello from ExerciseClient!");

            // Close the connection with the server
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
