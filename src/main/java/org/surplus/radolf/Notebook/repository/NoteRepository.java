package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.surplus.radolf.Notebook.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    Page<Note> findAllByOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByOrderByDateDesc(Pageable pageable);
    Page<Note> findAllByDoneTrueOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByDoneTrueOrderByDateDesc(Pageable pageable);
    Page<Note> findAllByDoneFalseOrderByDateAsc(Pageable pageable);
    Page<Note> findAllByDoneFalseOrderByDateDesc(Pageable pageable);
}
