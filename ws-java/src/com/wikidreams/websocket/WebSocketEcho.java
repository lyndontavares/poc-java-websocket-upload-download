package com.wikidreams.websocket;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.OnMessage;

@ServerEndpoint("/echo2")
public class WebSocketEcho {

	@OnMessage
	public String echo(String incomingMessage) {
		return "I got this (" + incomingMessage + ")"
		+ " so I am sending it back !";
	}
	 
}
 