package org.ece542.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class IRCServerSocket {

    private ServerSocket serverSocket;

    /**
     * Requires: portNum not Null and >0
     * Effects: Starts the ServerSocket and listens to requests from clients. starts a
     * new thread and client Socket for each client request.
     *
     * @param portNum
     * @throws IOException
     */
    public void start(int portNum) throws IOException {
        serverSocket = new ServerSocket(portNum);
        while (true)
            new IRCClientHandler(serverSocket.accept()).start();
    }

    /**
     * Effects: Closes the ServerSocket
     * @throws IOException
     */
    public void stop() throws IOException {
        serverSocket.close();
    }

    /* private helper class for maintaining a thread for each client
     *
     */
    private static class IRCClientHandler extends Thread {

        private Socket clientSocket;
        private BufferedInputStream inputStream;
        private BufferedOutputStream outputStream;

        public IRCClientHandler(Socket socket){
            this.clientSocket = socket;
        }

        /*Actions to take for each client connected to the server
         *
         *
         * */
        public void run(){
            try {
                inputStream = new BufferedInputStream(clientSocket.getInputStream());
                outputStream = new BufferedOutputStream(clientSocket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
