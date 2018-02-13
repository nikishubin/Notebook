package org.surplus.radolf.Notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.surplus.radolf.Notebook.entity.Note;
import org.surplus.radolf.Notebook.repository.NoteRepository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    private NoteRepository repository;

    @Autowired
    public void setProductRepository(NoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Note> listAllNotes() {
        return repository.findAll();
    }

    @Override
    public Note getNoteById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Note saveNote(Note note) {
        return repository.save(note);
    }

    @Override
    public Note updateNote(Integer id, String message, boolean done) {
        Note updated = repository.findOne(id);
        updated.setDate(new Date());
        updated.setDone(done);
        updated.setMessage(message);
        repository.save(updated);
        return updated;
    }

    @Override
    public void deleteNote(Integer id) {
        repository.delete(id);
    }

    @Override
    public Page<Note> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
