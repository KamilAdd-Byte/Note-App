package com.responsywnie.noteapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Document(collection = "Message")
public class Message {

    @Id
    @GeneratedValue
    private String id;

    private String author;

    private String message;

}
