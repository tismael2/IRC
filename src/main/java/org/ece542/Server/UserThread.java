package org.ece542.Server;

import java.net.Socket;

public class UserThread extends Thread{

    private Socket clientSocket;
    private ServerMain serverMain;
    private String userName;

    /**
     * Constructor
     * @param socket
     * @param serverMain
     */
    public UserThread(Socket socket, ServerMain serverMain) {
    }

    @Override
    public void run() {
        super.run();
    }

    public void sendMessage(String message) {
    }
}
