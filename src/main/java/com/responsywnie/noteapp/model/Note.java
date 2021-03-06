package com.responsywnie.noteapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Document(collection = "NoteBase")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

//    @Size(min = 2, max = 40,message = "Note subject must not be empty")
    private String subject;
//    @Size(min = 2, max = 40,message = "Note description must not be empty")
    private String description;
//    @Size(min = 2, max = 40,message = "Note author must not be empty")
    private String author;

    @Embedded
    private Audit audit = new Audit();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return id.equals(note.id) && subject.equals(note.subject) && description.equals(note.description) && author.equals(note.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, description, author);
    }
}
