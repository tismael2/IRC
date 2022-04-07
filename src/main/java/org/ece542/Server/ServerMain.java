package org.ece542.Server;

import java.io.IOException;

public class ServerMain {

    private String HOSTNAME;
    private static final int PORTNUM=5555;

    /**
     * Main entry point for Server.
     * @param args
     */
    public static void main(String[] args) {


        IRCServerSocket ircServerSocket = new IRCServerSocket();

        try {
            ircServerSocket.start(PORTNUM);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
