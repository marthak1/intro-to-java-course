package com.cbfacademy;

/*a ExerciseServer class which uses a ServerSocket to listen for connections 
on localhost:4040, then prints message it receives on the screen.
Ensure to release all resources at the end of your program.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        int port = 4040;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                // Accept incoming connection
                Socket socket = serverSocket.accept();

                // Handle the connection in a separate thread
                Thread connectionThread = new Thread(() -> {
                    try {
                        // Read data from the client via an InputStream
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String clientMessage = reader.readLine();
                        System.out.println("Received message from client: " + clientMessage);

                        // Close the connection with the client
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                connectionThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
