package com.wikidreams.websocket.teste;

import java.io.StringWriter;

import javax.json.Json;
import javax.json.JsonObject;

public class Figure {
	private JsonObject json;

	public Figure(JsonObject jsonObject) {
		this.json=jsonObject;
	}

	public JsonObject getJson() {
		return json;
	}

	public void setJson(JsonObject json) {
		this.json = json;
	}
	
	@Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(json);
        return writer.toString();
    }
	
}
