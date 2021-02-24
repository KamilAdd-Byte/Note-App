package com.responsywnie.noteapp.controller;

import com.responsywnie.noteapp.dao.NoteDAO;
import com.responsywnie.noteapp.model.Note;
import com.responsywnie.noteapp.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
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
        model.addAttribute("listNote",repository.findAll());
        return "index";
    }

    @GetMapping("/showNewNoteForm")
    public String showNewNoteForm(Model model){
        Note note = new Note();
        model.addAttribute("note",note);
        return "new_note";
    }

    @PostMapping(value = "/new_note")
    public String addNote(@ModelAttribute("note") Note note,Model model) {
        service.addNote(note);
        model.addAttribute("message","Dodano notatkę!");
        return "index";
    }
}
