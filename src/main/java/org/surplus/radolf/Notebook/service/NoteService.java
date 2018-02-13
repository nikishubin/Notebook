package org.surplus.radolf.Notebook.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.surplus.radolf.Notebook.entity.Note;

import java.util.List;

public interface NoteService {
    Iterable<Note> listAllNotes();
    Note getNoteById(Integer id);
    Note saveNote(Note note);
    Note updateNote(Integer id, String message, boolean done);
    void deleteNote(Integer id);
    Page<Note> findAll(Pageable pageable);
}
