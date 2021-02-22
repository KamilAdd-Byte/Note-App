package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteDAO extends MongoRepository<Note,Long> {
}
