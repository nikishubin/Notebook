package org.surplus.radolf.Notebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.surplus.radolf.Notebook.entity.Note;
import org.surplus.radolf.Notebook.service.NoteService;

@Controller
public class NoteController {

    private NoteService service;
    private String filterMethod = "ALL";
    private String sortDateMethod = "ASC";

    @Autowired
    public void setNoteService(NoteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String list(Model model, Pageable pageable) {
        Page<Note> notePage = filterAndSort(pageable);
        PageWrapper<Note> page = new PageWrapper<Note>(notePage, "/");
        model.addAttribute("notes", page.getContent());
        model.addAttribute("sort", sortDateMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "index";
    }

    @GetMapping("/filter/{filter}")
    public String filterChoose(@PathVariable String filter) {
        filterMethod = filter;
        return "redirect:/";
    }

    @GetMapping("/sort/{sortDate}")
    public String sortChoose(@PathVariable String sortDate) {
        sortDateMethod = sortDate;
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Note note = service.getNoteById(id);
        model.addAttribute("note", note);
        return "operations/edit";
    }

    @PostMapping("/update")
    public String saveNote(@RequestParam Integer id, @RequestParam String message,
                           @RequestParam(value = "done", required = false) boolean done) {
        service.updateNote(id, message, done);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String newNote() {
        return "operations/new";
    }

    @PostMapping("/save")
    public String updateNote(@RequestParam String message) {
        service.saveNote(new Note(message));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteNote(id);
        return "redirect:/";
    }

    private Page<Note> filterAndSort(Pageable pageable) {
        Page<Note> page = null;
        switch (filterMethod) {
            case "ALL":
                switch (sortDateMethod) {
                    case "ASC":
                        page = service.findAllByOrderByDateAsc(pageable);
                        break;
                    case "DESC":
                        page = service.findAllByOrderByDateDesc(pageable);
                        break;
                }
                break;
            case "TRUE":
                switch (sortDateMethod) {
                    case "ASC":
                        page = service.findAllByDoneTrueOrderByDateAsc(pageable);
                        break;
                    case "DESC":
                        page = service.findAllByDoneTrueOrderByDateDesc(pageable);
                        break;
                }
                break;
            case "FALSE":
                switch (sortDateMethod) {
                    case "ASC":
                        page = service.findAllByDoneFalseOrderByDateAsc(pageable);
                        break;
                    case "DESC":
                        page = service.findAllByDoneFalseOrderByDateDesc(pageable);
                        break;
                }
                break;
        }
        return page;
    }

}
