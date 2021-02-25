package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface NoteDAO extends MongoRepository<Note,String> {
}
