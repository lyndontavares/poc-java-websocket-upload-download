package com.wikidreams.websocket.angular;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(
	value="/echo-ng",
	encoders = {EchoEncoder.class},
	decoders = {EchoDecoder.class}
)
public class WebSocketEchoAngular {

	@OnMessage
	public String echo(String incomingMessage) {
		// return "\"retorno\""; //OK
		
		//String retorno = "I got this: " + incomingMessage + " so I am sending it back !";
		//return "\""+retorno+"\""; 
		//System.out.println(String.format("\"Send from back: %s \"",incomingMessage).replace("\"\"", "") );
		
		//"\"Send from back: \"oi\" \""
		
		
		System.out.println(String.format("\"Send from back: %s \"",incomingMessage).replace("\"\"", "") );
 		
		String ret = String.format("\"Send from back: %s \"",incomingMessage).replace("\"\"", "");
		 return "\"retorno\"";
		
	}
	
	/**
	 * escape()
	 *
	 * Escape a give String to make it safe to be printed or stored.
	 *
	 * @param s The input String.
	 * @return The output String.
	 **/
	public static String escape(String s){
	  return s.replace("\\", "\\\\")
	          .replace("\t", "\\t")
	          .replace("\b", "\\b")
	          .replace("\n", "\\n")
	          .replace("\r", "\\r")
	          .replace("\f", "\\f")
	          .replace("\'", "\\'")
	          .replace("\"", "\\\"");
	}
	 
}
 