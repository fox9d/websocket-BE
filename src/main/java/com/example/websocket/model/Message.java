package com.example.websocket.model;

import com.example.websocket.model.dto.MessageRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String content;

    public Message(MessageRequestDto message) {
        this.content = message.getMessage();
    }
}
