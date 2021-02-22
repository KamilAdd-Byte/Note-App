package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDao extends MongoRepository<Note,Long> {
    List<Note> getAllNote();
    void addNote(Note note);
    void deleteNote(Note note);
}
