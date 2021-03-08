package com.responsywnie.noteapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
@Getter
@Setter
public class Audit {
    private Date createOn;
    private Date updateOn;
    @PrePersist
    public void prePersist(){
        createOn = new Date();
    }
    @PreUpdate
    public void preUpdate(){
        updateOn = new Date();
    }
}
