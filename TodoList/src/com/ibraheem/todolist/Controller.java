package com.ibraheem.todolist;

import com.ibraheem.todolist.datamodel.TodoData;
import com.ibraheem.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for Amina", LocalDate.of(2021, Month.SEPTEMBER, 14));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "Get COVID vax at Jatkasaari", LocalDate.of(2021, Month.JULY, 30));
        TodoItem item3 = new TodoItem("Tax Office", "Visit tax office at Kluuvi on Monday", LocalDate.of(2021, Month.JULY, 12));
        TodoItem item4 = new TodoItem("KEG Email", "Reply to KEG email on PWA by Monday", LocalDate.of(2021, Month.JULY, 12));
        TodoItem item5 = new TodoItem("Send Money", "Send money for loan by Monday", LocalDate.of(2021, Month.SEPTEMBER, 12));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        TodoData.getInstance().setTodoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem oldTodoItem, TodoItem newTodoItem) {
                if(newTodoItem != null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df =DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
        //StringBuilder sb = new StringBuilder("Description: \n" + item.getDetails());
        //sb.append("\n\n\n\n");
        //sb.append("Due Date: ");
        //sb.append(item.getDeadline().toString());
        //itemDetailsTextArea.setText(sb.toString());
    }
}
