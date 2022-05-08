package com.wikidreams.websocket.angular;

import java.io.StringWriter;

import javax.json.Json;
import javax.json.JsonObject;

public class EchoData {

	private JsonObject data;

	public EchoData(JsonObject data) {
		this.data=data;
	}

	public JsonObject getData() {
		return data;
	}

	public void setData(JsonObject data) {
		this.data = data;
	}
	
	@Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(data);
        return writer.toString();
    }
	
}
