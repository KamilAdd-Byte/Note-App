package com.responsywnie.noteapp.model;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
public class Audit {
    private LocalDateTime dateAddNote;
    private LocalDateTime dateUpdateNote;

    @PrePersist
    void prePersist(){
        dateAddNote = LocalDateTime.now();
    }

    @PreUpdate
    public void preMerge(){
        dateUpdateNote = LocalDateTime.now();
    }
}
