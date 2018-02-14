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
    public Note getNoteById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public void saveNote(Note note) {
        repository.save(note);
    }

    @Override
    public void updateNote(Integer id, String message, boolean done) {
        Note updated = repository.findOne(id);
        updated.setDone(done);
        updated.setMessage(message);
        repository.save(updated);
    }

    @Override
    public void deleteNote(Integer id) {
        repository.delete(id);
    }

    @Override
    public Page<Note> findAllByOrderByDateAsc(Pageable pageable) {
        return repository.findAllByOrderByDateAsc(pageable);
    }

    @Override
    public Page<Note> findAllByOrderByDateDesc(Pageable pageable) {
        return repository.findAllByOrderByDateDesc(pageable);
    }

    @Override
    public Page<Note> findAllByDoneTrueOrderByDateAsc(Pageable pageable) {
        return repository.findAllByDoneTrueOrderByDateAsc(pageable);
    }

    @Override
    public Page<Note> findAllByDoneTrueOrderByDateDesc(Pageable pageable) {
        return repository.findAllByDoneTrueOrderByDateDesc(pageable);
    }

    @Override
    public Page<Note> findAllByDoneFalseOrderByDateAsc(Pageable pageable) {
        return repository.findAllByDoneFalseOrderByDateAsc(pageable);
    }

    @Override
    public Page<Note> findAllByDoneFalseOrderByDateDesc(Pageable pageable) {
        return repository.findAllByDoneFalseOrderByDateDesc(pageable);
    }
}
