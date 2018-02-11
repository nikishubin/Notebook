package org.surplus.radolf.Notebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.surplus.radolf.Notebook.entity.Note;
import org.surplus.radolf.Notebook.service.NoteService;

import java.util.Date;

@Controller
public class NoteController {

    @Autowired
    NoteService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("notes", service.findAll());
        return "layout";
    }

    @RequestMapping(value = "{noteID}/delete", method = RequestMethod.GET)
    public String deleteNote(@PathVariable("noteID") int id) {
        service.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newNote() {
        return "operations/new";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String createNote(@RequestParam("noteMessage") String message) {
        service.create(new Note(message, new Date(), false));
        return "redirect:/";
    }

    @RequestMapping(value = "{noteID}/update", method = RequestMethod.GET)
    public ModelAndView editNote(@PathVariable("noteID") int id) {
        ModelAndView editedNote = new ModelAndView("operations/update");
        editedNote.addObject("note", service.findById(id));
        return editedNote;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateNote(@RequestParam("noteMessage") String message, @RequestParam("noteID") int id) {
        service.edit(id, message);
        return "redirect:/";
    }
}
