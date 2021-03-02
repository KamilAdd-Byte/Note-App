package com.responsywnie.noteapp.service;

import com.responsywnie.noteapp.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<Message> allMessage();
    void addMessage(Message message);
    void removeMessage(Message message);
}
