package com.responsywnie.noteapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Document(collection = "NoteBase")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subject;

    private String description;

    private String author;

    public Note() {
    }
}
