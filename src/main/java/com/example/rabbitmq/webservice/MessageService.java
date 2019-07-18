package com.example.rabbitmq.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.rabbitmq.model.Message;
import org.springframework.stereotype.Component;



@Path("/send")
@Component

public interface MessageService {

    @POST
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createMessage(Message message);

}
