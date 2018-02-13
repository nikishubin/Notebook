package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.surplus.radolf.Notebook.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    Page<Note> findAll(Pageable pageable);
}
