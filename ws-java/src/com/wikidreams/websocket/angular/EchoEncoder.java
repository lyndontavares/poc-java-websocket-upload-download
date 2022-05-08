package com.wikidreams.websocket.angular;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class EchoEncoder implements Encoder.Text<EchoData>  {

	@Override
	public void init(EndpointConfig config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String encode(EchoData object) throws EncodeException {
		// TODO Auto-generated method stub
		return object.getData().toString();
	}

}
