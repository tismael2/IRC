package org.ece542.Client;

public class ClientMain {

    private String userName;

    /**
     * main entry point for IRC Client.
     * @param args
     */
    public static void main(String[] args) {

        String hostname = "localhost";
        int portnum = 5555;

        IRCClientSocket ircClientSocket = new IRCClientSocket();
        IRCClientUI ircClientUI = new IRCClientUI();

        ircClientUI.start();

        ircClientSocket.start(portnum, hostname);

        while(true){
            //todo main loop to take in chat inputs and listen for messages from server
        }
    }
}
