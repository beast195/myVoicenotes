package im;


import java.io.*;
/*
 * This class defines the different type of messages that will be exchanged between the
 * Clients and the Server. 
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no 
 * need to count bytes or to wait for a line feed at the end of the frame
 */
public class ChatMessage implements Serializable {

	protected static final long serialVersionUID = 1112122200L;

	// The different types of message sent by the Client
	// WHOISIN to receive the list of the users connected
	// MESSAGE an ordinary message
	// LOGOUT to disconnect from the Server
	static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2,getCords = 3, setCords= 4, getMine = 5,ReceiveCords=6;
	
	private int type;
	private String message,usern;
	
	// constructor
	ChatMessage(int type, String message,String usern) {
		this.type = type;
		this.message = message;
		this.usern = usern;
	}
	
	// getters
	int getType() {
		return type;
	}
	String getMessage() {
		return message;
	}
	String getusern() {
		return usern;
	}
}


