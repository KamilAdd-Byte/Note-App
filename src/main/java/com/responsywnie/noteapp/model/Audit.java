package com.responsywnie.noteapp.model;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
public class Audit {
    private LocalDateTime createdOn;
    private LocalDateTime updateOn;
    private LocalDateTime removeOn;

    @PrePersist
    public void preCreated(){
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    public void proUpdate(){
        updateOn = LocalDateTime.now();
    }
    @PreRemove
    public void preRemove(){
        removeOn = LocalDateTime.now();
    }
}
