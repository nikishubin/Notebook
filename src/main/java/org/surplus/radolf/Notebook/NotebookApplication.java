package org.surplus.radolf.Notebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.surplus.radolf.Notebook.entity.Note;
import org.surplus.radolf.Notebook.repository.NoteRepository;

@SpringBootApplication
public class NotebookApplication implements CommandLineRunner {

	@Autowired
	NoteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(NotebookApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		for (int i = 0; i < 5; i++) {
			repository.save(new Note("Note + " + (i+1)));
		}
	}
}
