package com.responsywnie.noteapp.controller;

import com.responsywnie.noteapp.dao.NoteDaoImpl;
import com.responsywnie.noteapp.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private final NoteDaoImpl noteDao;

    public NoteController(NoteDaoImpl noteDao) {
        this.noteDao = noteDao;
    }

    @GetMapping("/note")
    List<Note> postmanTestEndpoint(){
        return noteDao.getAllNote();
    }

    @PostMapping("/add")
    String addNote(@RequestBody Note note){
        noteDao.addNote(note);
        return "Add note to MongoDB"+ note.getId();
    }
}
