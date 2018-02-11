package org.surplus.radolf.Notebook.service;

import org.surplus.radolf.Notebook.entity.Note;

import java.util.List;

public interface NoteService {
    Note create(Note note);
    Note delete(int id);
    List<Note> findAll();
    Note edit(int id, String message);
    Note findById(int id);
}
