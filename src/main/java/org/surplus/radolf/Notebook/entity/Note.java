package org.surplus.radolf.Notebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private int id;

    private String message;
    private Date creationDate;
    private boolean finished;

    public Note() {
    }

    public Note(String message, Date creationDate, boolean finished) {
        this.message = message;
        this.creationDate = creationDate;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
