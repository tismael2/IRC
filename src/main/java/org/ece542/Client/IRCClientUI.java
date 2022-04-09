package org.ece542.Client;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * User Interface class to take inputs (commands, posts) and display information
 * provided from the server (posts, notifications).
 */
public class IRCClientUI extends Thread {


    @Override
    public void run() {
     while (true){

     }

    }

    private OutputStream outputStream;
    private InputStream inputStream;

    /**
     * Constructor.
     *
     */
    public IRCClientUI(){
        //TODO create OutputStream and InputStream
    }

    /**
     * Effects: IAE on message.length()!=2 else
     *          outputs a post in the format USERNAME: message text
     *
     * @param message String array. message[0] is Username of originator
     *               message[1] is content of the message
     * @throws IllegalArgumentException
     */
    public void writePost(String[] message) throws IllegalArgumentException{


    }


    /**
     * Effects: outputs a content of message from server
     * @param message String containing content of message from server
     */
    public void writeServerMsg(String message){

    }

    /**
     * Effects: returns an array of strings with command and content
     * @return String [0] contains command
     *          String [1] contains content, null if not applicable
     */
    public String[] getInput(){

        String[] result = new String[2];

        return result;
    }

    /** <bold>InputListner</bold> is used to monitor for UI inputs on the IRCClientUI.
     *
     */
    public class InputListener implements Runnable{

        @Override
        public void run() {

        }
    }

    public class OutputListener implements Runnable{

        @Override
        public void run() {

        }
    }
}
