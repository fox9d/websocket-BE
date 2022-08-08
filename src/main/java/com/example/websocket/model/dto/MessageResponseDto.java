package com.example.websocket.model.dto;

import com.example.websocket.model.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponseDto {
    private String message;

    public MessageResponseDto(Message message){
        this.message = message.getContent();
    }
}
