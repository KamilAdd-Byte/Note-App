package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends MongoRepository<Note,Long> {
}
