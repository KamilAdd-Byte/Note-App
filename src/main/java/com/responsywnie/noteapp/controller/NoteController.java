package com.responsywnie.noteapp.controller;

import com.responsywnie.noteapp.dao.NoteDAO;
import com.responsywnie.noteapp.model.Note;
import com.responsywnie.noteapp.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private final NoteDAO repository;

    @Autowired
    private final NoteServiceImpl service;

    public NoteController(NoteDAO repository, NoteServiceImpl service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/all")
    public String showNote(Model model) {
        model.addAttribute("listNote",service.allNote());
        return "note";
    }

    @PostMapping(value = "/add")
    public String addNote(@ModelAttribute("note") Note note,Model model) {
        service.addNote(note);
        model.addAttribute("note",new Note());
        return "note";
    }

}
