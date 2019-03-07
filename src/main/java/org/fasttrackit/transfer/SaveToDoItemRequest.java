package org.fasttrackit.transfer;

import java.sql.Date;

public class SaveToDoItemRequest {


    private String description;
    private boolean done;
    private Date deadline;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadLine) {
        this.deadline = deadLine;
    }

    @Override
    public String toString() {
        return "SaveToDoItemRequest{" +
                "description='" + description + '\'' +
                ", done=" + done +
                ", deadline=" + deadline +
                '}';
    }
}
