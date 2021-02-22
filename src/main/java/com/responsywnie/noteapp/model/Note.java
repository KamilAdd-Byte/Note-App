package com.responsywnie.noteapp.model;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Embedded;

@Document(collection = "NoteBase")
public class Note {
    private String subject;
    private String description;
    private String author;
    @Embedded
    private Audit audit;
}
