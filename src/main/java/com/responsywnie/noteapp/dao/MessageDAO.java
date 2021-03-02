package com.responsywnie.noteapp.dao;

import com.responsywnie.noteapp.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface MessageDAO extends MongoRepository<Message,String> {
}
