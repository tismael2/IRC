package org.ece542.Client;

import java.net.Socket;

/**
 * Class used to open a client Socket connection to the server.
 */
public class IRCClient {
    private String hostname;
    private String username;
    private int portnum;
    private Socket clientSocket;

    /**
     * Effects: Constructor of instance
     * @param hostname String IP Address or hostname of the server connecting to.
     * @param portnum portnum used for IRC server
     */
    public IRCClient(int portnum, String hostname, String username){
        this.hostname = hostname;
        this.portnum = portnum;
        this.username = username;
    }
    
    /**
     * Requires: portnum and hostname not null.  portnum>0
     * Effects: Creates new IRCClientSocket instance to opens a client Socket to IRC Server. 
     *          Also Attaches input stream and output stream of Socket.
     */
    public connectSocket(){
       if(hostname != null && portnum>0){
           //creates socket connection to server
           clientSocket = new Socket(hostname, port);
           system.out.println("Socket is Connected");
           
           //instantiates 2 simultaneous threads for reading/writing 
           new IRCreadingThread(clientSocket, this).begin();
           new IRCwritingThread(clientSocket, this).begin():
       } 
    } 
    
    /**
     * Effect: returns this client's username
     */
    public String getUsername(){
        return this.username;
    }
    
     /**
     * Effects: Changes this client's username
     * @param username: the client's new proposed username
     */
    public changeUserName(String username){
        if(username == null || username.isEmpty())
            System.out.println("INVALID USERNAME");
        else{
            this.username = username;
            System.out.println("Username Changed to: "+this.username);
        }
    }
    
    /**
     * Effects: closes input and output streams, then closes socket connection
     *
     * @throws IOException
     */
    public void closeConnection() throws IOException {
        clientSocket.close();
    }
}
