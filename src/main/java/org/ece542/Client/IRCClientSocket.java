package org.ece542.Client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Class used to open a client Socket connection to the server.
 */
public class IRCClientSocket {

    private Socket clientSocket;
    private BufferedOutputStream outputStream;
    private BufferedInputStream inputStream;

    /**
     * Requires: portnum and hostname not null.  portnum>0
     * Effects: Opens a client Socket to IRC Server. Attaches input stream and output stream of Socket.
     *
     * @param hostname String IP Address or hostname of the server connecting to.
     * @param portnum portnum used for IRC server
     */
    public void start(int portnum, String hostname){

    }

    /**
     * Effects: closes input and output streams, then closes socket connection
     *
     * @throws IOException
     */
    public void stop() throws IOException {
        inputStream.close();
        outputStream.close();
        clientSocket.close();
    }

    /**
     * Effects: sends a message to the server.
     *
     * @param message
     */
    public void sendMessage(String message){

    }

    /**
     * Effects: receives message from the server and prints it out the terminal.
     * @param message String containing message from the server.
     */
    public void readMessage(String message){

    }
}
