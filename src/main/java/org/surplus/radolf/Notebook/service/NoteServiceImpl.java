package org.surplus.radolf.Notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.surplus.radolf.Notebook.entity.Note;
import org.surplus.radolf.Notebook.repository.NoteRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    NoteRepository repository;

    @Override
    @Transactional
    public Note create(Note note) {
        return repository.save(note);
    }

    @Override
    @Transactional
    public Note delete(int id) {
        Note deletedNote = repository.findOne(id);
        repository.delete(id);
        return deletedNote;
    }

    @Override
    @Transactional
    public List<Note> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Note edit(int id, String message) {
        Note editedNote = repository.findOne(id);
        editedNote.setMessage(message);
        return editedNote;
    }

    @Override
    @Transactional
    public Note findById(int id) {
        return repository.findOne(id);
    }
}
