package com.example.websocket.controller;

import com.example.websocket.model.Message;
import com.example.websocket.model.dto.MessageRequestDto;
import com.example.websocket.model.dto.MessageResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {
    @MessageMapping("/receive")
    @SendTo("/sub/chat")
    public MessageResponseDto messaging(MessageRequestDto requestDto){
        Message message = new Message(requestDto);
        log.info("payload: "+message.getContent());
        return new MessageResponseDto(message);
    }
}
