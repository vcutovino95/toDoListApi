package org.fasttrackit.service;

import org.fasttrackit.domain.ToDoItem;
import org.fasttrackit.persistance.ToDoItemRepository;
import org.fasttrackit.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {

        System.out.println("Creating item: " + request);
        toDoItemRepository.createToDoITem(request);


    }


    public List<ToDoItem> getToDoItemss() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Getting to do items");
        return toDoItemRepository.getToDoItems();


    }

}

