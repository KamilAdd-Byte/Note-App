package com.responsywnie.noteapp.model;

import java.time.LocalDateTime;

public class Audit {
    private LocalDateTime dateAddNote;
    private LocalDateTime dateUpdateNote;

    void prePersist(){
        dateAddNote = LocalDateTime.now();
    }
    public void preMerge(){
        dateUpdateNote = LocalDateTime.now();
    }
}
