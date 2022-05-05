package com.wikidreams.websocket.controller;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 

@Path("down")
public class RestDownload {

    final String path = "d:\\upload\\a.pdf";

    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response doTest() throws Exception {
        InputStream is = new FileInputStream(path);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len;
        byte[] buffer = new byte[4096];
        while ((len = is.read(buffer, 0, buffer.length)) != -1) {
            baos.write(buffer, 0, len);
        }
        System.out.println("Server size: " + baos.size());
        return Response.ok(baos).build();
    }
}