package org.ece542.Client;

public class ClientMain {
    /**
     * main entry point for IRC Client.
     * @param args
     */
    public static void main(String[] args) {

        String hostname = "localhost";
        int portnum = 5555;

        IRCClientSocket ircClientSocket = new IRCClientSocket();


        ircClientSocket.start(portnum, hostname);

        while(true){
            //todo main loop to take in chat inputs and listen for messages from server
        }
    }
}
