package com.responsywnie.noteapp.service;

import com.responsywnie.noteapp.dao.MessageDAO;
import com.responsywnie.noteapp.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDAO repository;

    @Override
    public List<Message> allMessage() {
        return repository.findAll();
    }

    @Override
    public void addMessage(Message message) {
        this.repository.save(message);
    }

    @Override
    public void removeMessage(Message message) {
        this.repository.delete(message);
    }
}
