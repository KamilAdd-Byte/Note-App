package com.responsywnie.noteapp.service;

import com.responsywnie.noteapp.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {
    List<Note> allNote();
    void addNote(Note note);
}
