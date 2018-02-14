package org.surplus.radolf.Notebook.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.surplus.radolf.Notebook.entity.Note;

import java.util.List;

public interface NoteService {
    Note getNoteById(Integer id);
    void saveNote(Note note);
    void updateNote(Integer id, String message, boolean done);
    void deleteNote(Integer id);
    Page<Note> findAllByOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByOrderByDateDesc(Pageable pageable);
    Page<Note> findAllByDoneTrueOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByDoneTrueOrderByDateDesc(Pageable pageable);
    Page<Note> findAllByDoneFalseOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByDoneFalseOrderByDateDesc(Pageable pageable);
}
