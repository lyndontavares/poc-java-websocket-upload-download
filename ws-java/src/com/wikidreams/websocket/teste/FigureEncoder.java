package com.wikidreams.websocket.teste;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class FigureEncoder implements Encoder.Text<Figure> {

	@Override
	public void init(EndpointConfig config) {
		System.out.println("init");
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		
	}

	@Override
	public String encode(Figure object) throws EncodeException {
		return object.getJson().toString();
	}

}
