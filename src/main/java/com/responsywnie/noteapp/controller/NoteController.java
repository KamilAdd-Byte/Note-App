package com.responsywnie.noteapp.controller;

import com.responsywnie.noteapp.dao.NoteDAO;
import com.responsywnie.noteapp.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private final NoteDAO noteDao;

    public NoteController(NoteDAO noteDao) {
        this.noteDao = noteDao;
    }

    @GetMapping("/all")
    List<Note> postmanTestEndpoint() {
        return noteDao.findAll();
    }

    @PostMapping("/add")
    String addNote(@RequestBody Note note) {
        noteDao.save(note);
        return "Add note to MongoDB" + note.getId();
    }

    @PostMapping("/remove/{id}")
    String removeNoteById(@PathVariable("id") Long id) {
        noteDao.deleteById(id);
        return "Delete success ::";
    }
}
