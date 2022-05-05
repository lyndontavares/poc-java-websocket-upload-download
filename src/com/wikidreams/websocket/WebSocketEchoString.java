package com.wikidreams.websocket;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.OnMessage;

@ServerEndpoint("/echo-string")
public class WebSocketEchoString {

	private String string = "";
	
	@OnMessage
	public String echo(String incomingMessage, boolean isLast) {
		
		this.string = this.string + incomingMessage;
		 
		return isLast? this.string: "";
	}
	 
}
 