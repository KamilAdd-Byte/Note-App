package com.responsywnie.noteapp.service;

import com.responsywnie.noteapp.dao.NoteDAO;
import com.responsywnie.noteapp.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteDAO repository;

    @Override
    public List<Note> allNote() {
        return repository.findAll();
    }

    @Override
    public void addNote(Note note) {
        this.repository.save(note);
    }

    @Override
    public void removeNote(Note note) {
        this.repository.delete(note);
    }
}
