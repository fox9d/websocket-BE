package com.example.websocket.controller;

import com.example.websocket.model.Message;
import com.example.websocket.model.dto.MessageRequestDto;
import com.example.websocket.model.dto.MessageResponseDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @MessageMapping("/receive")
    @SendTo("/sub/chat")
    public MessageResponseDto messaging(MessageRequestDto requestDto){
        Message message = new Message(requestDto);
        return new MessageResponseDto(message);
    }
}
