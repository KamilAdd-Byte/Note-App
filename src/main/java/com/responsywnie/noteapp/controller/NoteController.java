package com.responsywnie.noteapp.controller;

import com.responsywnie.noteapp.dao.NoteDAO;
import com.responsywnie.noteapp.model.Note;
import com.responsywnie.noteapp.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    @Autowired
    private final NoteDAO repository;

    @Autowired
    private final NoteServiceImpl service;

    public NoteController(final NoteDAO repository, final NoteServiceImpl service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/index")
    public String showFormAllNote(Model model) {
        model.addAttribute("listNote", repository.findAll());
        return "index";
    }

    @GetMapping("/")
    public String showAllNote(Model model) {
        model.addAttribute("listNote", repository.findAll());
        return "index";
    }

    @GetMapping("/showNewNoteForm")
    public String showNewNoteForm(Model model) {
        Note note = new Note();
        model.addAttribute("note", note);
        return "new_note";
    }

    @PostMapping(value = "/new_note")
    public String addNewNote(@ModelAttribute("note") Note note, Model model) {
        service.addNote(note);
        model.addAttribute("message", "Dodano notatkę!");
        return "redirect:/index";
    }
}
