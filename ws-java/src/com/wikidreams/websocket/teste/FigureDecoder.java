package com.wikidreams.websocket.teste;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class FigureDecoder implements Decoder.Text<Figure> {

	@Override
	public void init(EndpointConfig config) {
		System.out.println("init");
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public Figure decode(String s) throws DecodeException {
		JsonObject jsonObject = Json.createReader(new StringReader(s)).readObject();
        return  new Figure(jsonObject);
	}

	@Override
	public boolean willDecode(String s) {
		try {
            Json.createReader(new StringReader(s)).readObject();
            return true;
        } catch (JsonException ex) {
            ex.printStackTrace();
            return false;
        }
	}

}
