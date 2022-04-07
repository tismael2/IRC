package org.ece542.common.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Different types of messages that can be sent to/from the Client or Server.
 * There are two base message types:
 * 1) Admin - Connection confirmation, close connection, room list, join/leave room, create/delete room
 * 2) Room Post
 */
public class IRCMessage {

    public final byte[] buf;
    private MessageType type;
    private int messageLength;


    public IRCMessage(byte[] buf){
        this.buf=buf;
        this.messageLength=buf.length-1;

        switch (buf[0]) {
            case 0:
                type = MessageType.POST;
                break;
            case 1:
                type = MessageType.CLOSE;
        }
    }

    public String getPost() throws UnsupportedEncodingException {
        byte[] postbytes = Arrays.copyOfRange(buf, 1, buf.length);
        String post = new String(postbytes, "UTF-8");

        return post;
    }

    private static enum MessageType{
        POST, CLOSE;
    }

}
