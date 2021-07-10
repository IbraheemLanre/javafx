package com.ibraheem.todolist;

import com.ibraheem.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for Amina", LocalDate.of(2021, Month.SEPTEMBER, 14));
        TodoItem item2 = new TodoItem("Doctor's Appointment", "Get COVID vax at Jatkasaari", LocalDate.of(2021, Month.JULY, 30));
        TodoItem item3 = new TodoItem("Tax Office", "Visit tax office at Kluuvi on Monday", LocalDate.of(2021, Month.JULY, 12));
        TodoItem item4 = new TodoItem("KEG email", "Reply to KEG email on PWA by Monday", LocalDate.of(2021, Month.JULY, 12));
        TodoItem item5 = new TodoItem("Send Money", "Send money for loan by Monday", LocalDate.of(2021, Month.SEPTEMBER, 12));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

    }
}
